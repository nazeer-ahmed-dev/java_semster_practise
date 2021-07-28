package Lab2;

public class Task2_PrintIntialsOfString {
    public static void main(String args[]) {
        String name = "Nazeer Ahmed kunbhar";
        System.out.println(name.charAt(0));
        for(int i=0;i<name.length();i++){
            if((int)name.charAt(i)==32)
                System.out.println(name.charAt(i+1));
        }
    }
}
