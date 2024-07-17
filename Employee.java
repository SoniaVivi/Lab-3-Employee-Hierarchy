// Siona Vivian
// 16/7/24
// CS 143
// Lab 3: Employee Hierarchy
/*
The program is to create a general Employee superclass that factors out common
attributes and behaviors in the subclasses. Additionally is to create a
BasePlusCommissionEmployeeTest.java program.
*/
// Sources: Dietel Textbook / Provided files

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public String toString() {
        return String.format("First Name: %s%n    Last Name: %s%n    SSN: %s",
                            this.firstName, this.lastName, this.socialSecurityNumber);
    }
}
