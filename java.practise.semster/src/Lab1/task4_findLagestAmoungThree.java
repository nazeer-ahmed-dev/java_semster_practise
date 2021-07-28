package Lab1;
import java.util.Scanner;
public class task4_findLagestAmoungThree {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value 1 : ");
        int val1 = obj.nextInt();
        System.out.print("Enter the value 2 : ");
        int val2 = obj.nextInt();
        System.out.print("Enter the value 3 : ");
        int val3 = obj.nextInt();

        if(val1>val2 && val1>val3)
        {
            System.out.println(val1+" is largest ");
        }
        else if(val2>val1 && val2>val3)
        {
            System.out.println(val2+" is largest ");
        }
        else
        {
            System.out.println(val3+" is largest ");
        }

    }
}

