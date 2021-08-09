package Lab2;

public class Task3_StringReplacement {
    public static void main(String args[])
    {
        String Sample  = "The quick brown fox jumps over the lazy dog.";
        String output = Sample.replaceAll("fox","cat");
        System.out.println(output);
    }
}
