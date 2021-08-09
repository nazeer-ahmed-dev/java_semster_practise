package Lab3;

public class Employee_class {
    String name;
    int year_of_join;
    int salary;
    String address;

    Employee_class(String name,int year_of_join,int salary , String address)
    {
        this.name = name;
        this.year_of_join = year_of_join;
        this.salary = salary;
        this.address = address;
    }
    void display()
    {
        System.out.println(name+"      "+year_of_join+"       "+address);

    }
    public static void dis()
    {
        //display();
        System.out.println("hello");
    }


}
