package Lab4;

public class gcdCalculate {
    int smallVal;
    int largeVal;
    void gcdCal(int a , int b)
    {
        if(a<b)
        {
            largeVal = b;
        }
        else
        {
            smallVal = b;
            largeVal = a;
        }

        //division
        int result = largeVal%smallVal;




    }
}
