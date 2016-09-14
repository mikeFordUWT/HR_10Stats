package day0;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Mike on 9/13/16.
 */
public class Weighted_Mean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        double[] xS = new double[length];
        int[] weights = new int[length];
        for(int i = 0; i < length; i++){
            xS[i] = (double) in.nextInt();
        }

        for(int i = 0; i < length; i++){
            weights[i] = in.nextInt();
        }

        double weightedAverage = weighted(xS,weights);
        System.out.println(weightedAverage);
    }

    private static double weighted(double[] xS, int[] weights){
        int weightSum = weightedSum(weights);
        double ret = 0.0;
        double xSum = 0.0;
        for(int i = 0; i < xS.length; i++){
            xSum += (xS[i] * weights[i]);
        }

        ret = xSum/weightSum;
        DecimalFormat df = new DecimalFormat("#.#");
        ret = Double.valueOf(df.format(ret));
        return ret;
    }

    private static int weightedSum(int[] weight){
        int sum = 0;
        for(int i =0; i< weight.length; i++){
            sum+= weight[i];
        }
        return sum;
    }
}
