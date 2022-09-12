//program to print all month's days

import java.util.Scanner;




public class Main {


public static void main(String[] args) {


    System.out.printf("enter the month");
        Scanner in=new Scanner(System.in) ;

        int x= in.nextInt();



        switch (x) {


        case 1:

        System.out.println(" January "+"\t"+" 31 days");

        break;

        case 2:

        System.out.println(" February "+"\t"+" 29 days ");

        break;

        case 3:

        System.out.println(" March "+"\t"+" 31 days");

        break;


        case 4:

        System.out.println(" april "+"\t"+" 30 days");

        break;

        case 5:

        System.out.println(" May "+"\t"+" 31 days");

        break;

        case 6:

        System.out.println(" June "+"\t"+" 30 days");

        break;

        case 7:

        System.out.println(" July "+"\t"+" 31 days");

        break;

        case 8:

        System.out.println(" August "+"\t"+" 31 days");

        break;

        case 9:

        System.out.println(" September "+"\t"+" 30 days ");

        break;

        case 10:

        System.out.println(" October "+"\t"+" 31 days");

        break;

        case 11:

        System.out.println(" November "+"\t"+" 30 days ");

        break;

        case 12:

        System.out.println(" December "+"\t"+" 31 days ");

        break;

            default:
                System.out.printf("wrong input");

        }

        }





        }
