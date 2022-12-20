package mannnD4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class arraysRey {
    public static void main(String[] args) {
        int[] arr =getRandomValues();
        System.out.println(Arrays.toString(arr));
        System.out.println(adder(arr));

    }

    public static  int adder(int[] arr){
int sum=0;
        for(int i=0;i<arr.length;i++){
            sum =sum + arr[i];
        }return sum;

    }

    public static int[] getRandomValues(){
        int[] arr = new int[10];
       for (int i =0; i<arr.length; i++){
           arr[i] =ThreadLocalRandom.current().nextInt(10,100);
       }return arr;
    }
}
