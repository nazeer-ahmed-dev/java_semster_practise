package Lab2;

public class Task6_OddLIst { ;
    public static void main(String args[])
    {
        int[] array = new int [20];
        int c=0;
        for(int i=0;i<20;i++)
        {
            if(i%2==0)
            {

            }
            else
            {
                array[c]= i;
                c++;
            }
        }
        for(int j=0;j<c;j++)
        {
            System.out.print(array[j]+" ");
        }
    }
}
