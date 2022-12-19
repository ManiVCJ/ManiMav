package mannn;

import java.util.Scanner;

public class PalindromRey {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter your favirote number");
        int num = number.nextInt();
        System.out.println("your fav numbe is " + num);
        int rem = 0;
        int rev = 0;
        int temp = num;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (num == rev) {
            System.out.println(num + " is palindrom");
        } else {
            System.out.println(num + " not a palindrom");
        }
    }

}
