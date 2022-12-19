package mannn;

import java.util.Scanner;

public class FactorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nuber...");
        int factor = sc.nextInt();

        for(int i=1; i<=factor; i++){
            if(factor % i == 0 ){
                System.out.print(i+" ");
            }
        }
    }
}
