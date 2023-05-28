import  java.util.Scanner;
public  class leacture6_javaProgrammingEeercise {
    public  static void main(String[] args){
        System.out.println("enter the 5 subject  marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first subject");
        int sub1 = sc.nextInt();
        System.out.println("enter the second subject");
        int sub2 = sc.nextInt();
        System.out.println("enter the third subject");
        int sub3 = sc.nextInt();
        System.out.println("enter the fourth subject");
        int sub4 = sc.nextInt();
        System.out.println("enter the fifth subject");
        int sub5 = sc.nextInt();

        int total = sub1 +sub2 + sub3 + sub4 + sub5 ;
        double percentage = (total/500.0f) * 100 ;
        System.out.println(percentage);



    }
}

