/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author mdeboer1 This class is an intermediary class the takes user
 information and from main method and creates an Employee object, sets the
 employee information through Employee's public setter. It has private getters
 and setters and public methods to get and set the EmployeeManager booleans,
 this protects how and when they are created.  Although several of the setters
 are never actually used in the class as it it implemented now.  I wonder if its
 best practice to code them anyways in case they are needed for some reason in the
 future?  Seems like in these small programs they don't hurt anything since
 resources aren't the important yet...but that won't always be the case.
 */
public class EmployeeManager {

    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    Employee employee;

    public EmployeeManager(String firstName, String lastName,
            String ssn, String birthDate) {
        employee = new Employee();
        employee.setEmployeeInformation(firstName, lastName, ssn, birthDate);
    }

    //Public getter for EmployeeManager properties (gets the status of boolean properties
    
    public void getHiredEmployeeConditions() {
        System.out.println(this.isMetWithHr() + " " + this.isMetDeptStaff()
                + " " + this.isReviewedDeptPolicies() + " " + this.isMovedIn() + " "
                + this.getCubeId());
    }

    //Getter for Employee information
    public void getEmployeeInformationFromEmployee() {
        employee.getEmployeeInformation();
    }

    //Private getters and setters for EmployeeManager properties
    private boolean isMetWithHr() {
        return metWithHr;
    }

    private void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    private boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    private void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    private boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    private void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    private boolean isMovedIn() {
        return movedIn;
    }

    private void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    //public method to access the private methods of Employee
    public void setEmployeeNecessities(String cubeId) {

        this.meetWithHrForBenefitAndSalryInfo();
        this.meetDepartmentStaff();
        this.reviewDeptPolicies();
        this.moveIntoCubicle(cubeId);
        this.getStatus();
    }

    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if (metWithHr) {
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if (metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        if (metWithHr && metDeptStaff && reviewedDeptPolicies) {
            this.cubeId = cubeId;
            this.movedIn = true;
        } else {
            System.out.println("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }
    }

    private String getStatus() {
        if (metWithHr && metDeptStaff
                && reviewedDeptPolicies && movedIn) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }

    private String getCubeId() {
        return cubeId;
    }

    private void setCubeId(String cubeId) {
        if (cubeId == null || cubeId.equals(" ")) {
            System.out.println("This is not a valid Id!");
        } else {
            this.cubeId = cubeId;
        }
    }
}
