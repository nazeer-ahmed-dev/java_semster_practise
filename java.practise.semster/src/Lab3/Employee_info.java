package Lab3;

public class Employee_info {

    int salary ;
    int noOfHours;
    void getInfo(int salary , int noOfHours)
    {
        this.salary = salary;
        this.noOfHours= noOfHours;
    }
    void AddWork()
    {
            if(noOfHours > 6  )
            {
                this.salary =this.salary  +  5;
            }
    }
}
