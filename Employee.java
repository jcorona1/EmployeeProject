import java.math.BigDecimal;
import java.time.LocalDate;
// "Extends" specifies this class inherits from the class Object (does anyway by default)
public class Employee extends Object {

    // Class level constants go here
    final public String COMPLEX_CODE = "89376";

    // Fields/Instance variable/Class variables/Object variables go here -- synonyms
    private String firstName = "";
    private char middleInitial = ' ';
    private String lastName = "";
    private String idNumber = "";
    private String socialSecurityNumber = "";
//    private String dateOfBirth = "";
    private LocalDate dateOfBirth;
//    private double salary = 0;
    private BigDecimal salary = BigDecimal.valueOf(0);

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        if(salary.compareTo(BigDecimal.ZERO) > 0) {
            this.salary = salary;
        }
    }

    // Constructors are the special methods called when the "new" keyword is used
    // and an object is instantiated
    public Employee(String firstName, char middleInitial, String lastName, String idNumber, String socialSecurityNumber, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.socialSecurityNumber = socialSecurityNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(String firstName, char middleInitial, String lastName, String idNumber, String socialSecurityNumber, LocalDate dateOfBirth, BigDecimal salary) {
        this(firstName, middleInitial, lastName, idNumber, socialSecurityNumber, dateOfBirth);
        this.salary = salary;
    }

    @Override
    public String toString() {

        String buildString = "";
        buildString += "First Name: " + this.firstName + "\n";
        buildString += "Middle Initial: " + this.middleInitial + "\n";
        buildString += "Last Name: " + this.lastName + "\n";
        buildString += "ID Number: " + this.idNumber + "\n";
        buildString += "Social Security Number: " + this.socialSecurityNumber + "\n";
        buildString += "Date of Birth: " + this.dateOfBirth + "\n";

        if(salary.compareTo(BigDecimal.ZERO) > 0) {
            buildString += "Salary: " + this.salary + "\n";
        }

        buildString += String.format("First Name: %s \n", this.firstName);
        buildString += String.format("Middle Initial: %s \n", this.middleInitial);
        buildString += String.format("Last Name: %s \n", this.lastName);
        buildString += String.format("ID Number: %s \n", this.idNumber);
        buildString += String.format("Social Security Number: %s \n", this.socialSecurityNumber);
        buildString += String.format("Date of Birth: %s \n", this.dateOfBirth);

        if(salary.compareTo(BigDecimal.ZERO) > 0) {
            buildString += String.format("Salary: $%.2f \n", this.salary);
        }

        return buildString;
    }

}



