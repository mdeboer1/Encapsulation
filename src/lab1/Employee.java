package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 * updated by mdeboer1
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;

    public Employee() {

    }
    
    //Private method for setting Employee information
    private void setEmployeeInformation(String firstName, String lastName, 
            String ssn, Date birthDate, String cubeId){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSsn(ssn);
        this.setBirthDate(birthDate);
        this.setCubeId(cubeId);
    }
    
    //Public method to get the Employee information
    public String getEmployeeInformation(){
        String employeeInfo = this.getFirstName() + " " + this.getLastName() +
                " " + this.getSsn() + " " + this.getBirthDate() + " " + this.getCubeId();
        
        return employeeInfo;
    }
    
    //public method to access the private methods of Employee
    public void setEmployeeNecessities(String firstName, String lastName, 
            String ssn, Date birthDate, String cubeId){
        this.setEmployeeInformation(firstName, lastName, ssn, birthDate, cubeId);
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
        if(metWithHr) {
            metDeptStaff = true;
        } else {
            System.out.println("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            System.out.println("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
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
        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && movedIn) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        if (firstName == null || firstName.equals(" ")){
            System.out.println("This is not a valid name!");
        }
        else {
        this.firstName = firstName;
        }
    }    

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        if (lastName == null || lastName.equals(" ")){
            System.out.println("This is not a valid name!");
        }
        else {
        this.lastName = lastName;
        }
    }

    private String getSsn() {
        return ssn;
    }

    private void setSsn(String ssn) {
        if (ssn == null || ssn.equals(" ")){
            System.out.println("This is not a valid name!");
        }
        else {
        this.ssn = ssn;
        }
    }

    private Date getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    private String getCubeId() {
        return cubeId;
    }

    private void setCubeId(String cubeId) {
        if (cubeId == null || cubeId.equals(" ")){
            System.out.println("This is not a valid name!");
        }
        else {
        this.cubeId = cubeId;
        }
    }
    
    
}
