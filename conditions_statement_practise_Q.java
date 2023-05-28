import java.util.Scanner;
public class conditions_statement_practise_Q {
    public static void main(String[] args) {
//        byte m1 , m2 , m3 ;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the makes for physics");
//        m1 = sc.nextByte();
//        System.out.println("enter the makes for chemistry");
//        m2 = sc.nextByte();
//        System.out.println("enter the makes for maths");
//        m3 = sc.nextByte();
//        float avg  = (m1+m2+m3)/3.0f;
//        System.out.println("overall percentage is: "+avg);
//        if (avg>=40  && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("cong, you have been  promoted");
//        }
//        else {
//            System.out.println("soory, you have not ");
//        }

        // question 2 -- tax paid my the employye 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  income  in lakhs");
        float tax = 0; 
        float income  = sc.nextFloat();
        if (income<=2.5){
            tax = tax+0;
        }
        else if (income>2.5f && income<=5.0f){
            tax = tax + 0.05f *(income - 2.5f);
            
            
        } else if (income >5f && income<=10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        } else if (income>10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);

        }
        System.out.println("the tottal tax = "+ tax);

    }
}
