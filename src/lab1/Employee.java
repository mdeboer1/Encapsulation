package lab1;


/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 * updated by mdeboer1
 * 
 * This class controls only the creation of Employee objects and their biographical
 * information.  It has private getters and setters, and employees public methods
 * for outside classes to get and set the information so it is done only in the way
 * intended.  All setters have validation to ensure null and empty strings are not
 * passed.  All other information about the conditions that must be met by the employee
 * that has been hired has been moved to the HiredEmployee Class, and the HiredEmployee
 * creates the Employee object in its constructor.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private String birthDate;
    
    public Employee() {
        /*I wonder if setEmployeeInformation method could be eliminate and use
        * the constructor to do what that method does?  Call the private methods
        * from here to set the biographical information for employee!
        */
     }
    
    //Public method for setting Employee information, see notes above, does this need to exist?
    public void setEmployeeInformation(String firstName, String lastName, 
            String ssn, String birthDate){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSsn(ssn);
        this.setBirthDate(birthDate);
    }
    
    //Public method to get the Employee information
    public void getEmployeeInformation(){
        System.out.println(this.getFirstName() + " " + this.getLastName() + " " +
              this.getSsn() + " " + this.getBirthDate());
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
            System.out.println("This is not a valid Social Security Number!");
        }
        else {
        this.ssn = ssn;
        }
    }

    private String getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(String birthDate) {
        if (birthDate == null || birthDate.equals(" ")){
            System.out.println("This is not a valid date!");
        }
        else {
        this.birthDate = birthDate;
        }
    }    

}
