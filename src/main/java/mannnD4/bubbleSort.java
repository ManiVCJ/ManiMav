package mannnD4;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9,4,6,3,8,2,7,0};

        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }


        }System.out.println(Arrays.toString(arr));
    }
}
