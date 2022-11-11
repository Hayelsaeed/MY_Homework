import java.util.Scanner;
public class Homework3B {
    public static void main(String[] args) {
        int n ;
        Scanner x=new Scanner(System.in);
        System.out.println("please enter any number :");
        n=x.nextInt();
        if(n>0)
            System.out.println("the number you entered is positive ");
        else if(n<0)
            System.out.println("the number you entered is negative ");
        else
            System.out.println("the number you entered is zero");

    }
}
