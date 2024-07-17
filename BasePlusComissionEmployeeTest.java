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

public class BasePlusComissionEmployeeTest {
    public static void main(String args[]) {
        BasePlusCommissionEmployee tom =
            new BasePlusCommissionEmployee("Tom", "Smith",
                    "123-45-6789", 1000d, 0.3d, 16.67d);
        System.out.printf(tom.toString());

        System.out.printf("%n=============%n");
        System.out.println("Setting base salary to 20 and commision rate to .05");
        System.out.printf("=============%n");
        tom.setBaseSalary(20);
        tom.setCommissionRate(.05d);
        System.out.printf(tom.toString());
    }
}
