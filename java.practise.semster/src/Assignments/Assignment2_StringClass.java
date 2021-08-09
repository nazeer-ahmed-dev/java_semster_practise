package Assignments;

public class Assignment2_StringClass {

    public static void main(String args[])
    {

        String name = "I am Nazeer Ahmed";
        String S1 = "Hello";
        String S2 = "hello";
        int value = 10;
        // 1-   working with CharAt() return A index value
        System.out.println("CharAt(0) : "+name.charAt(0));

        //2-    working with String CompareTO return (+ve , -ve or 0)
        System.out.println("comparing two string : "+S1.compareTo(S2));

        //3-    String Concat (combined string)
        System.out.println("String concatination : "+S1.concat(S2));

        //4-    String Contain return (true or false)
        System.out.println("name contain Nazeer  : "+name.contains("Nazeer"));

        //5-    String endWith return (true or false)
        System.out.println(name+" end with Ahmed : "+name.endsWith("Ahmed"));

        //6-    String equal return (true or false)
        System.out.println("S1 equall S2 : "+S1.equals(S2));

        //7-    String indexOf return index of string
        System.out.println("Index of am in Name is : "+name.indexOf("am"));

        //8-    String isEmpty return true if length 0 other wise flase
        System.out.println("name is Empty : "+name.isEmpty());

        //9-    String join it joined string with delimeter
        System.out.println("name : "+String.join("-","Nazeer","Ahmed"));

        //10-   String lastIndexof return lastindexof string
        System.out.println("last index of name : "+name.lastIndexOf("Nazeer"));

        //11-   String length return the size-1 of string
        System.out.println("Total Char in name : "+(name.length()+1));

        //12-   String replace return replaced string
        System.out.println("Nazeer replace with Naveed : "+name.replace("Nazeer","Naveed"));

        //13-   Spilt it return array of string
        System.out.println("split: "+name.split("\\s")[0]);

        //14-   subString retrun specific string
        System.out.println("Name contains : "+name.substring(4,9));

        //15-   toCharArary retrun Array of Character
        System.out.println("String to char aray : "+name.toCharArray());

        //16-   toLowerCase
        System.out.println("Lower case : "+name.toLowerCase());

        //17-   toUpperCase
        System.out.println("Upper Case : "+name.toUpperCase());

        //18-   trim delete spaces
        System.out.println("deleting space from name : "+name.trim());

        //19-   valueOf
        System.out.println("int Contacatination : "+(String.valueOf(value)+22));


    }
}
