package Lab3;
import java.util.Date;

public class year {

    int year1;

    year(int year1)
    {
        this.year1 = year1;
    }
    void calculation()
    {
        System.out.println("Age : "+((new Date()).getYear()+1900-year1));
    }
}
