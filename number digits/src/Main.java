//program to print number digits

import java.util.Scanner;

public class Main {

    public static void main(String[]args)  {

        Scanner in=new Scanner(System.in);

        int x= in.nextInt();
        if (x>0 ){

            for (int i=0;i<x;i++){
                System.out.println(i);


            }
        }
        else if (x<0) {
            System.out.println(x-1);

        }
        
    }

}
