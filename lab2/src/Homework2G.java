import java.util.Scanner;
public class Homework2G {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.print("Enter the x:");
        int x=s.nextInt();
        int y=x*x;
        System.out.println("the sqar of: "+x+" Is: "+y);
        int z=x*x*x;
        System.out.println("the cube of: "+x+" Is: "+z);
        double d=Math.pow(x,4);
        System.out.println("the of fourth pow: "+x+" Is: "+d);

    }
}
