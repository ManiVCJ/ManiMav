package mannn;

import java.util.Scanner;

public class NumberPartern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbr");
        int patnum = sc.nextInt();

        for(int i=1; i<= patnum; i++){
            for(int j =1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
