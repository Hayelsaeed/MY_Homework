import java.util.Scanner;
public class Homework2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2 =sc.nextInt();
        System.out.print("Enter the number3: ");
        int num3  = sc.nextInt();
        int l=num1+num2+num3/3;
        System.out.print("Avarige="+ l);
    }
}
