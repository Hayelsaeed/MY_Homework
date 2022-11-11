import  java.util.Scanner;
public class Homework3A {
    public static void main(String[] args) {
        int s;
        String y;
        String color="some thing is wrong! try again";
        Scanner x=new Scanner(System.in);
        System.out.println("please enter any of follow (a,b,c,d) and Enter the number of your mind ");
        y=x.next();
        s=x.nextInt();
        if(y.equals("a")||y.equals("b")||y.equals("c")||y.equals("d"))
        {if(s<=8 && s>=1 && s%2==1  )
            color="black";
        else if (s<=8 && s>=1 && s%2==0  )
            color="whit";


            System.out.println(color);
        }


    }
}
