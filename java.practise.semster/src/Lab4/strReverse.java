package Lab4;

public class strReverse {

    int i=0,j=0;
    void reverseOrder(String value)
    {
        i = value.length()-1;
        if(value.length()!=j)
        {
            System.out.print(value.charAt(i-j));
            j++;
            reverseOrder(value);
        }


    }
}
