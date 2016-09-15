package day1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by michaelford on 9/14/16.
 */
public class StandardDeviation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] numbers = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++){
            numbers[i] = in.nextInt();
            sum+= numbers[i];
        }

        standDev(sum, N, numbers);

    }

    static void standDev(int sum, int N, int[] numbers){
        DecimalFormat df = new DecimalFormat("#.#");
        double mean = (double) (sum/N);

        float squaredDistance = 0;
        for(int i = 0; i< N; i++){
            squaredDistance += Math.pow((numbers[i] - mean),2);
        }

        double squareD = squaredDistance;

        double sd = Double.valueOf(df.format(Math.sqrt(squareD/N)));

        df.format(sd);
        System.out.println(sd);
    }
}
