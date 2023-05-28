import java.util.Scanner;
public class string_practise {
    public static void main(String[] args) {
        String name = "Aman Gupta" ;
        name = name.toLowerCase();
        System.out.println(name);
        // problem 2
         String text  = " to lower case ";
         text  =  text.replace(" " , "_");
        System.out.println(text);

        //problem 3
        String letter = "dear <|name|> , thanks a lot" ;
        letter = letter.replace("<|name|>" , "aman");
        System.out.println(letter);

        // problem -- WAP to detect a double and triple strings

        String myString = "this string contains   double and triple  spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //problem -- WA TO FORMAT THE LETTER USING SEQUENCE CHARACTER

        String letters = "Desr Aman,\n\tThis is a message from your future self . " +
                "\n\t I request you to study hard as possible as you can ." +
                " \n\tOther you will face a lot of problems ." +
                "\n Thanks" ;
        System.out.println(letters);



    }
}
