package Lab1;
import java.util.Scanner;
public class task2 {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value  :");
        int value = obj.nextInt();
        if(value%2==0)
            System.out.println("value is Even");
        else
            System.out.println("Value is Odd");

    }}

