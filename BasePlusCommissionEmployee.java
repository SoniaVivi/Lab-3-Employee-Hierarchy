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

public class BasePlusCommissionEmployee extends CommissionEmployee{
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName,
      String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {

      super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   }

   // set base salary
   public void setBaseSalary(double baseSalary) {
      if (baseSalary < 0.0) {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }

      this.baseSalary = baseSalary;
   }

   // return base-salaried commission employee's base salary
   public double getBaseSalary() {
      return baseSalary;
   }

   // calculate base-salaried commission employee's earnings
   public double earnings() {
      return getBaseSalary() + super.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString() {
      return String.format("%s %s\n    %s: %.2f\n    %s: %.2f%n", "Base-Salaried",
         super.toString(), "Base Salary", getBaseSalary(), "Earnings", earnings());
   }
}
