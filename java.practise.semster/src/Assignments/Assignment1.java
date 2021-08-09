package Assignments;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String args[])
    {

        String[] studentName = new String[4];
        float [][] Marks = new float[4][];
        float [] percentage = new float[4];
        int [] totaltakensubject = new int[4];



        Scanner for_string = new Scanner(System.in);
        Scanner for_int = new Scanner(System.in);
        Scanner for_float = new Scanner(System.in);

        for(int i=0;i<4;i++)
        {
            System.out.print("Enter the Student Name "+i+" : ");
            studentName[i]= for_string.nextLine();

            System.out.print("Total subject Taken by "+studentName[i]+" : ");
            totaltakensubject[i] = for_int.nextInt();

            int size = totaltakensubject[i];
            Marks[i] = new float[size];

            for(int j=0;j<size;j++)
            {
                System.out.print(studentName[i]+" Subject "+j+" Marks : ");
                Marks[i][j] = for_int.nextFloat();
            }

        }
        calculating_percentage(Marks,percentage);
        print_data(studentName,Marks,percentage,totaltakensubject);
    }
    public static void calculating_percentage(float array[][],float percentage[])
    {
        int counter = 0;
        float sum =0 ;
        float perc=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                sum += array[i][j];
                counter = counter + 100;

            }
            perc = sum/counter;
            perc = perc  * 100;
            percentage[i]= perc;
            sum =0;
            perc=0;
            counter = 0;

        }
    }
    public static void print_data(String name[] , float marks[][] , float percentages[] , int totalsubjectstaken[])
    {
        System.out.println("-------------------------------------------");
        System.out.println("..... Percenatage Calculator .....");
        System.out.println("-------------------------------------------");
        System.out.println("Name | SubjectTaken | TotalPercentage | MarksOfSubjects");
        for(int i=0;i<4;i++)
        {
            System.out.print(name[i]+"        "+totalsubjectstaken[i]+"              "+percentages[i]+"        ");
            for(int j=0;j<marks[i].length;j++)
            {
                System.out.print(marks[i][j]+" , ");
            }
            System.out.println();
        }
    }
}
