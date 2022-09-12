//program to print if the numbers are in order or not in order
import java.util.Scanner;

public class Main {

    public static void main(String[] ARGS) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter 3 number");


        int x = in.nextInt();

        int a = in.nextInt();

        int b = in.nextInt();


        if (x >= a && x >= b && a <= x && a >= b && b <= x && b <= a) {
            System.out.printf(x + " " + a +" "+ b);
            System.out.println("in order");



        }
        else if (x <= a && x <= b && a >= x && a <= b && b >= x && b >= a) {
            System.out.printf(x + " " + a +" "+ b);
            System.out.println(" order");


        }
        else {

            System.out.println("not in order");


        }

    }
}
