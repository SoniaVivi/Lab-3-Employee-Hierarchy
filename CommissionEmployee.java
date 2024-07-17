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

public class CommissionEmployee extends Employee{
   private double grossSales; // gross weekly sales
   private double commissionRate; // commission percentage

   // five-argument constructor
   public CommissionEmployee(String firstName, String lastName,
      String socialSecurityNumber, double grossSales,
      double commissionRate) {
      super(firstName, lastName, socialSecurityNumber);

      // if grossSales is invalid throw exception
      if (grossSales < 0.0) {
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
      }

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   }

   // set gross sales amount
   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) {
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
      }

      this.grossSales = grossSales;
   }

   // return gross sales amount
   public double getGrossSales() {
      return grossSales;
   }

   // set commission rate
   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }

      this.commissionRate = commissionRate;
   }

   // return commission rate
   public double getCommissionRate() {
      return commissionRate;
   }

   // calculate earnings
   public double earnings() {
      return getCommissionRate() * getGrossSales();
   }

   // return String representation of CommissionEmployee object
   @Override
   public String toString() {
      return String.format("%s:%n    %s%n    %s: %.2f%n    %s: %.2f",
         "Commission Employee", super.toString(),
         "Gross Sales", getGrossSales(),
         "Commission Rate", getCommissionRate());
   }
}
