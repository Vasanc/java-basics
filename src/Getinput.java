import java.util.Scanner;

public class Getinput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        char ch = s.next().charAt(0);
        float f = s.nextFloat();
        double res = a+f;
        System.out.println(ch); 
        System.out.println(res);
    }
}
