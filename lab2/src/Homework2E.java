import java.util.Scanner;
public class Homework2E {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print("Enter b: ");
        int b=sc.nextInt();
        x=x*b;
        b=x/b;
        x=x/b;
        System.out.println("value of x: "+ x);
        System.out.println("value of b: "+ b);

    }
}
