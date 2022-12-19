package mannn;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many first event numbers you want..?");
        int even = sc.nextInt();

//        for(int i = 1; i<= even; i++){
//            if(i%2 == 0){
//                System.out.print( i );
//            }

        for(int i =2; i<=even; i=i+2){
            System.out.print( i+" " );
        }
        for(int i =1; i<=even; i=i+2){
            System.out.println(i+" ");
        }
    }
}
