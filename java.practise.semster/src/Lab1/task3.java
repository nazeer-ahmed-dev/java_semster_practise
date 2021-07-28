package Lab1;
import java.util.Scanner;
public class task3 {
    public  static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int output=0;
        System.out.print("Enter the value 1  : ");
        double value1 = obj.nextDouble();
        System.out.print("Enter the value 2  : ");
        double value2 = obj.nextDouble();

        if(value2>0)
            output = (int)(value1/value2);
        else
            System.out.println("cant divide by zero ! ");

        System.out.println("output  : "+output);
    }
}
