import java.util.Scanner;

public class conditions_statement {
    public static void main(String[] args) {

//        int age = 6 ;
//        if (age>18){
//            System.out.println("yes boy is can drive");
//        }
//        else {
//            System.out.println("no boy not yet");
//        }
        int age ;
        System.out.println("please enter the age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("you are experience");
        }
        else if(age > 46){
            System.out.println("you are semi experice");
        }
        else if (age>36) {
            System.out.println("you are semi semi eperinced");
        }
        else{
            System.out.println("you are not experience");
        }


    }
}
