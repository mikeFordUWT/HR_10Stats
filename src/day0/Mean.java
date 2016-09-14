package day0;

import com.sun.tools.javac.code.Attribute;

import java.util.*;

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

        int[] copy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copy);
        int c4 = copy[copy.length/2];
        int c5 = copy[(copy.length/2) - 1];
        double mids = c4+c5;
        double median = mids/2;
        int mode = findMode(copy);
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
    }

    private static int findMode(int[] arr){
        HashMap<Integer, Integer> freqs = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            if(!freqs.containsKey(arr[i])){
                freqs.put(arr[i], 1);
            }else{
                freqs.put(arr[i], freqs.get(arr[i]) + 1);
            }
        }


        int ret = arr[0];
        for(Integer i: freqs.keySet()){
            int key = i;
            int value = freqs.get(key);
            if(value > freqs.get(ret)){
                ret = key;
            }
        }

        ArrayList<Integer> dupes = new ArrayList<>();
        int value = freqs.get(ret);
        for(Integer i: freqs.keySet()){
            if(freqs.get(i) == value){
                dupes.add(i);
            }
        }

        Collections.sort(dupes);
        ret = dupes.get(0);
        return ret;
    }
}
