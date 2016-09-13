package day0;

import java.util.Scanner;

/**
 * Created by michaelford on 9/13/16.
 */
public class Mean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] numbers = new int[length];
        for(int index = 0; index < length; index++){
            numbers[index] = in.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < length; i++){
            sum += numbers[i];
        }
        double mean = ((double)sum)/length;

        double median = (double)(numbers[length/2-1] + numbers[length/2-2])/length;
        System.out.println(mean);
        System.out.println(median);
    }
}
