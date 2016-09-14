package day1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Created by michaelford on 9/14/16.
 */
public class quartiles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] nums = new int[length];

        for(int i =0; i< length; i++){
            nums[i] = in.nextInt();
        }

        in.close();

        Arrays.sort(nums);

        int[] left, right;


        int l, x, u;
        int mid = nums.length/2;
        x = median(nums);

        left = Arrays.copyOfRange(nums, 0, mid);
        if(length%2 ==0){
            right = Arrays.copyOfRange(nums, mid, nums.length);
        }else{
            right = Arrays.copyOfRange(nums, mid+1, nums.length);
        }


        l = median(left);
        u = median(right);

//        for(int i =0; i< length; i++){
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
        System.out.println(l);
        System.out.println(x);
        System.out.println(u);

    }

    static int median(int a[]){
        int med=0, mid, len = a.length;
        mid = len/2;
        if(a.length %2 ==0){

            med = (a[mid] + a[mid-1])/2;
        }else{
            med = (a[mid]);
        }

        return med;
    }
}
