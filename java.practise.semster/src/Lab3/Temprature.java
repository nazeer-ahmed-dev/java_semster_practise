package Lab3;

public class Temprature {
    double celcuis;
    double fernhite;

    Temprature(double celcuis)
    {
        this.celcuis = celcuis;
        this.fernhite = (1.8*this.celcuis)+32;
    }
    void calculator()
    {
        System.out.println("Celcuis to Fernhite : "+this.fernhite);
    }

}
