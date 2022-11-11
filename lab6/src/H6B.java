import java.util.Scanner;

public class H6B {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        for (int i=2;i<=100;i+=2){
            sum=sum+i;
        }
        System.out.println("sum of even number " + sum);
        sum=0;
        int a=in.nextInt();
        int b=in.nextInt();
        for (int i=a;i<=b;i++){
            if (i%2 !=0){
                sum+=i;
            }
        }
        System.out.println("Odd number " + sum);
        sum=0;
        a=in.nextInt();
        while (a>0){
            int r=a % 10;
            if (r % 2!=0){
                sum=sum+r;
            }
            a/=10;
        }
        System.out.println("Odd number " + sum);
    }
}
