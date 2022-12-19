package mannn;

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
//        int n= 100;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println(+i+ "welcome");
//        }
//        int j =0;
//        while (j < 3){
//            System.out.println("bye");
//            j++;
//
//        }
        Scanner num = new Scanner(System.in);
        System.out.println("enter the table you want baby");
        int table = num.nextInt();

        for(int i =10; i>=1; i--){
            System.out.println(+table+ "x " +i+ " = " +(table*i));
        }


    }
}
