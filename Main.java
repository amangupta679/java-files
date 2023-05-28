import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        // variables
       //  variables are container that store data values
        // string int float boolean char
       //   how to declare variavles
        String name = "aman";
        // short cut to write sout
        System.out.println(name);
        int a = 45;
        float b = 45.22f ;
        boolean isAdult = false ;

        System.out.println(b);
        System.out.println(isAdult);
        // taking user input in java
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the input");
        String input = scan.nextLine();
        System.out.println(input);

        // now taking integer input
        System.out.println("enter a number");
        int input1 = scan.nextInt();
        System.out.println(input1);

        // string methods
        // escape sequence character
        

    }

}