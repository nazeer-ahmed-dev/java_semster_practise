package Lab4;

public class calaculateBMI {


    public static double calculateMBI(double weight , double height)
    {
        double BMI = (weight/height)*703;
        return  BMI;
    }
    public static String findStatus(double bmi)
    {
            if(bmi<18.50)
            {
                return "Under Weight";
            }
            else if(bmi>=18.5 && bmi <= 24.9)
            {
                return "Normal";
            }
            else if(bmi>=25.0 && bmi<=29.9)
            {
                return  "Overweight";
            }
            else
            {
                return "Obese";
            }
    }
}
