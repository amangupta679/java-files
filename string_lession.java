import java.util.Scanner;
public class string_lession {
    public static void main(String[] args) {
      //  String name = new String("aman");
        String  name = "Aman";
        System.out.println(name);

       int value  = name.length();
        System.out.println(value);

       String smallletter = name.toLowerCase();
        System.out.println(smallletter);

        String biggerletter = name.toUpperCase();
        System.out.println(biggerletter);

        System.out.println(name.substring(1,4));
        System.out.println(name.replace('a' , 'c'));
        System.out.println(name.replace("m","aaaaa"));
        System.out.println(name.startsWith("A"));
        System.out.println(name.endsWith("m"));



    }
}
