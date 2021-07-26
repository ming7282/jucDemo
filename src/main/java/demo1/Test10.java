package demo1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {

        int [] arr = {5,1,12,22,3};
        int len = arr.length;
        int tmp;
        int i;
        int j;
        for (i = 1; i < len; i++) {
            tmp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > tmp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
