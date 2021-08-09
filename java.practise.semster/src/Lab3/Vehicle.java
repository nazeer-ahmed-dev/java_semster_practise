package Lab3;

public class Vehicle {
    int noOfSeats;
    int noOfWheel;

    Vehicle(int noOfSeats,int noOfWheel)
    {
        this.noOfSeats = noOfSeats;
        this.noOfWheel = noOfWheel;
    }
    void showVehicle()
    {
        System.out.println(noOfSeats+"    "+noOfWheel);
    }

}
