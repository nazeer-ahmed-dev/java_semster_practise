package Lab2;

public class Task4_primeNumber {
    public static void main (String args[]) {
        boolean check = true;
        int [] array = new int[600];
        int c=0;
        System.out.print("1 ");
        for(int i=2;i<600;i++)
        {
                for(int j=2;j<i;j++)
                {
                    if(i%j==0) {
                        check = false;
                        break;
                    }
                }
                if(check==true)
                {
                    array[c]=i;
                    System.out.print(i+" ");
                    c++;
                }
                else {
                    check = true;
                }

        }

    }
}
