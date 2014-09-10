package lab1;


/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 *
 * @version     1.01
 * 
 * Updated by mdeboer1
 */

public class Startup {
    public static void main(String[] args) {
        /*
            Are we violating SRP (Single Responsibility Principle)?
        
            HINT: think about what we are trying to do ... hire an employee.
            Whose job is it to do this? The current class? Or, a new class?
            Should we do the work here or delegate to the new class? You
            may need to create a new class that talks to Employee. This does
            not have to be a GUI class.
        */
//        Employee employee = new Employee();
//        employee.firstName = "Peter";
//        employee.lastName = "Piper";
//        employee.ssn = "333-1234";
//        
//        employee.meetDepartmentStaff();
//        employee.meetWithHrForBenefitAndSalryInfo();
//        employee.reviewDeptPolicies();
//
//        System.out.println("The employee's status is: " + employee.getStatus());
         // Properties to pass info to HiredEmployee Class
//        boolean metWithHr = true;
//        boolean metDeptStaff = true;
//        boolean reviewedDeptPolicies = true;
//        boolean movedIn = true;
        String cubeId = "A01";
        String firstName = "Mark";
        String lastName  = "DeBoer";
        String ssn = "555-55-5555";
        String birthDate= "1/1/1975";
        
        /*For ease, I am passing preset information rather than collecting information
        * from a user.  This could be done through Scanner of GUI.
        */
        
        HiredEmployee hiredEmployee = new HiredEmployee(firstName, lastName, ssn, birthDate);
        
        //a.setHiredEmployeeConditions(metWithHr, metDeptStaff, reviewedDeptPolicies, movedIn, cubeId);
        hiredEmployee.setEmployeeNecessities(cubeId);
        
        hiredEmployee.getEmployeeInformationFromEmployee();
        hiredEmployee.getHiredEmployeeConditions();
        
//        Employee test = new Employee();
//        test.setEmployeeInformation(firstName, lastName, ssn, birthDate);
//        test.getEmployeeInformation();
    }
    
    
}
