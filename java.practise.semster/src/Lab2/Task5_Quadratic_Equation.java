package Lab2;
import  java.util.Scanner;
import java.lang.Math;
public class Task5_Quadratic_Equation
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter X : ");
        double x = obj.nextInt();
        System.out.print("Enter a : ");
        double a = obj.nextInt();
        System.out.print("Enter b : ");
        double b = obj.nextInt();
        System.out.print("Enter c : ");
        double c = obj.nextInt();

        double output = (a * Math.pow(x,2)) + (b*x) + c;
        System.out.println("ax2+bx+c : "+output);
    }
}
