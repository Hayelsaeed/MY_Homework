import java.util.Scanner;

public class H6A {
    public static void main(String[] args) {
        System.out.println("please enter an initial investment balance ($0.00): $");
        Scanner x=new Scanner(System.in);
        double amount=x.nextDouble();
        double interest_rate=x.nextDouble();
        interest_rate=interest_rate/100;
        int time=1;
        while (amount<1000000){
            amount=amount*(1+(interest_rate*time));
            time++;

        }
        System.out.println("year to reach one million: " + time);

    }
}
