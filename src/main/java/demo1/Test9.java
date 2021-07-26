package demo1;

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        int temp;
        int [] arr ={5,6,10,9,21,1};
        for (int i =0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-i-1;j++){

                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
