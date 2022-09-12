//program to check if the numbers ard increasing or decreasing
import java.util.Scanner;

public class Main{

    public static void main(String[] ARGS) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter 3 number");


        int x = in.nextInt();

        int a = in.nextInt();

        int b = in.nextInt();


        if (x >= a && x >= b && a <= x && a >= b && b <= x && b <= a) {
            System.out.println(x + " " + a + " " + b + " decreasing");


        } else if (x <= a && x <= b && a >= x && a <= b && b >= x && b >= a) {

            System.out.println(x + " " + a + " " + b + " increasing ");
        }

        else {
            System.out.printf("neither");
        }
    }
}
