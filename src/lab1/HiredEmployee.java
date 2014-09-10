/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.util.Date;

/**
 *
 * @author mdeboer1
 * 
 */
public class HiredEmployee {
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    
    public HiredEmployee(String firstName, String lastName, 
            String ssn, Date birthDate, String cubeId){
        Employee a = new Employee();
        a.setEmployeeInformation(firstName, lastName, ssn, birthDate, cubeId);
    }
    
    //Public setter for HiredEmployee properties (sets the status of the boolean properties
    public void setHiredEmployeeConditions(boolean metWithHr, boolean metDeptStaff,
            boolean reviewedDeptPolicies, boolean movedIn, String cubeId){
        this.setMetWithHr(metWithHr);
        this.setMetDeptStaff(metDeptStaff);
        this.setReviewedDeptPolicies(reviewedDeptPolicies);
        this.setMovedIn(movedIn);
        this.setCubeId(cubeId);
    }
    
    //Public getter for HiredEmployee properties (gets the status of boolean properties
    public String getHiredEmployeeConditions(){
        String employeeConditions = this.isMetWithHr() + " " + this.isMetDeptStaff() +
                " " + this.isReviewedDeptPolicies() + " " + this.isMovedIn() + " " +
                this.getCubeId();
        return employeeConditions;
    }
    
    //Private getters and setters for HiredEmployee properties
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
    public void setEmployeeNecessities(){
        
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
