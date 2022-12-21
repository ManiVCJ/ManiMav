package mannnD4;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {

        int[] arr = new int[]{4,66,8,7,5,54,45,3,32,25,7,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value you wanna search");
        int key = sc.nextInt();

        int index = -1;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("we found the key " +key +" in the "+index+ " index position");
        }else{
            System.out.println("key is not present in the array");
        }
    }
}
