package Lab4;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        // task1 BMI Calculator
        System.out.println("Enter the Weight in Pound");
        double weight = obj.nextDouble();
        System.out.println("Enter the Height in inches");
        double height = obj.nextDouble();

        System.out.println("Weight status : "+calaculateBMI.findStatus(calaculateBMI.calculateMBI(weight,height)));

        //Task2 Overloading
        printTest pObj = new printTest();
        pObj.print('a',1);
        pObj.print(3,'c');

        // Task3 Returing last digit of integer
        System.out.println("last digit : "+findLastDigit.lastDigit(2525));


        //Task4 GCD Calcualte
        gcdCalculate gObj = new gcdCalculate();

        //Task5 using reversing string using recursion
        strReverse sObj = new strReverse();
        sObj.reverseOrder("Nazeer Ahmed");



    }
}
