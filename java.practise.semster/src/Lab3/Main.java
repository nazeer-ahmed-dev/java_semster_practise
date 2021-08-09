package Lab3;

public class Main {

    public static void main(String args[])
    {
        // task1 : Employee Class

        Employee_class obj1 = new Employee_class("Robert",1994,2500,"64C-WallsStreat");
        Employee_class obj2 = new Employee_class("Sam",2000,2600,"68C-WallsStreat");
        Employee_class obj3 = new Employee_class("John",1999,6000,"26B-WallsStreat");

        System.out.println("Name       yearOfJoin    Address");
        obj1.display();
        obj2.display();
        obj3.display();
        System.out.println();
        // task2 : Employee Info
        Employee_info eObj1  = new Employee_info();
        eObj1.getInfo(3000,5);

        //task3 : Vehicle Class

        Vehicle vObj1 = new Vehicle(25,10);
        System.out.println("NoOfSeats      NoOfWheels");
        vObj1.showVehicle();

        //task3 : celcuius to ferhite
        Temprature tobj1 = new Temprature(5.5);
        tobj1.calculator();

        //task4 : age calcuation
        year yObj1 = new year(1999);
        yObj1.calculation();




    }
}
