// [1,2,3] -> [1,2,4]
// [5,9,9] -> [6,0,0]
// [9,9,9] -> [1,0,0,0]

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = new int[]{5,9,9};
        System.out.println(Arrays.toString(IntegerPlusOne(arr)));

    }
    public static int[] IntegerPlusOne(int[] arr){

        int index = arr.length-1;

        //handle 9+1 case
        while(arr[index]==9){
            arr[index] = 0;
            index--;
            if (index<0){
                arr = new int[arr.length+1];
                arr[0] = 1;
                break;
            }
        }
        if (index>=0){
            arr[index]++;
        }
        return arr;
    }
}

