package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by michaelford on 9/14/16.
 */
public class InterquartileRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arrSize = in.nextInt();
        int[] elements = new int[arrSize];
        int[] freqs = new int[arrSize];
        for(int i = 0; i < arrSize; i++){
            elements[i] = in.nextInt();
        }

        for(int i = 0; i< arrSize; i++){
            freqs[i] = in.nextInt();
        }

        System.out.println(interquartileRange(elements, freqs));
    }

    static double interquartileRange(int[] elements, int[] freqs){
        double range = 0.0;
        ArrayList<Integer> bringTogether = new ArrayList<>();
        for(int i = 0; i < elements.length; i++){
            for(int j = 0; j < freqs[i]; j++){
                bringTogether.add(elements[i]);
            }
        }
        int size = bringTogether.size();
        int mid = size/2;
        Collections.sort(bringTogether);
        List<Integer> left, right;
        left = bringTogether.subList(0, mid);
        if(size % 2 ==0){
            right = bringTogether.subList(mid,size);
        }else{
            right = bringTogether.subList(mid+1, size);
        }

        double q1 = median(left);
        double q3 = median(right);

        range = q3 - q1;
        return range;
    }


    static double median(List<Integer> a){
        double med=0.0;
        int mid, len = a.size();
        mid = len/2;
        if(a.size() %2 ==0){

            med = (a.get(mid) + a.get(mid-1))/2;
        }else{
            med = (a.get(mid));
        }

        return med;
    }
}
