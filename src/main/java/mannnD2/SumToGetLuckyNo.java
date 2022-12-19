package mannnD2;

import java.util.Scanner;

public class SumToGetLuckyNo {
    public static void main(String[] args) {
        Scanner lucky = new Scanner(System.in);
        System.out.println("enter the number you wanna add to get lucky number");

        int lucnum = lucky.nextInt();
        int tem = lucnum;
        while(tem>=10){
            tem = (tem % 10) + (tem /10);


        }
        System.out.println("the luckey added number form " +lucnum + " is " +tem);
    }
}
