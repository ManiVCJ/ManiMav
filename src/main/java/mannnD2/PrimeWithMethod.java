package mannnD2;

import java.util.Scanner;

public class PrimeWithMethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nuber you wanna check");
        int i = sc.nextInt();

        System.out.println(primeCount(20,100));
        while (true) {
            if (isPrime(i)) {
                System.out.println("true");
                break;
            }else {
                System.out.println("false");
                break;

            }
        }
    }

    public static int primeCount(int lb, int ub){
        int count =0;
        for(int i =lb; i<=ub; i++){
            if(isPrime(i)){
                count++;
            }
        }return count;

    }


    public static boolean isPrime(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                count++;
            }
        }
        return (count==2);
    }
}
