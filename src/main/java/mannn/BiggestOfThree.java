package mannn;

import java.util.Scanner;

public class BiggestOfThree {

    public static void main(String[] args) {

        int big=0;

        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int number1;

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter the number 2");
        int number2 = num2.nextInt();

        Scanner num3 = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int number3 = num3.nextInt();

        if(number1 > number2 && number1 > number3){
            big = number1;
        }else if(number2 > number3){
            big = number2;
        }else{
            big = number3;
        }
        System.out.println("biggest number of three is " +big);
    }
}
