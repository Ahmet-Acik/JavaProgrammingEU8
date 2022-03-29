package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

//        int[] numbers = {10, 20, 30, 40};
//        //               0    1   2   3
//
//        int[] reversed = new int[numbers.length]; //to mke sure that the array has enough capacity to contain all the elements of first array

        /*
                 j            i
        reversed[0] = numbers[3];
        reversed[1] = numbers[2];
        reversed[2] = numbers[1];
        reversed[3] = numbers[0];
*/

        int[] numbers = {10, 20, 30, 40};
        int[] reversed = new int[numbers.length];
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversed));


        int[] nums = new int[]{ 10, 20, 30, 40, 50, 60 };
        for (int i = 0,  j= nums.length-1 ; i < nums.length/2; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        System.out.println("reverse nums = " + Arrays.toString(nums));

        double [] dobs = new double[]{1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        for (int i = 0, j= dobs.length-1; i < dobs.length/2; i++, j--) {

            double tem = dobs[i];
            dobs [i] = dobs[j];
            dobs [j] = tem;
        }
        System.out.println("reversed dobs = " + Arrays.toString(dobs));


        String [] s = new String[]{"ali", "veli", "cem", "mete", "can", "batu"};
        for (int i = 0, j = s.length-1; i < s.length/2; i++, j--) {
            String tem = s[i];
            s[i] = s[j];
            s[j] = tem;
        }
        System.out.println("reversed s = " + Arrays.toString(s));


    }


}
