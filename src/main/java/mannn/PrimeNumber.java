package mannn;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number you wanna check");
        int num = number.nextInt();
        boolean isPrime = true;


//        int count=0;
//
//        for(int i=1; i<=pnum; i++){
//
//            if(pnum % i == 0){
//                count++;
//            }
//
//        }if(count == 2){
//            System.out.println("Its a prime number");
//        }else{
//            System.out.println("not prime");
//        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime");
        } else {
            System.out.println(num + " is not a prime");
        }

    }

}
