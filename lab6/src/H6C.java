import java.util.Scanner;

public class H6C {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the word: ");
        String word=in.next();
        for (int i=0;i<word.length();i++){
            System.out.println(word.charAt(i));
        }
    }
}
