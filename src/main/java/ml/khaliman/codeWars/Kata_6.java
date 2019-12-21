package ml.khaliman.codeWars;
import java.util.Arrays;

import java.util.stream.IntStream;

public class Kata_6 {
    static int[] newA;
    static int[] newB;

    public static boolean comp(int[] a, int[] b) {
        newA = Arrays.stream(a).sorted().toArray();
        newB = Arrays.stream(b).sorted().toArray();
        boolean result = true;
        for (int i = 0; i < newA.length; i++) {
            if (Math.sqrt(newB[i]) == (double) newA[i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static String getMiddle(String word) {
        String result = "";
        IntStream stream = word.chars();
        int count = (int) stream.count();
        if(count%2!=1){
            result= stream.skip(count/2 -1).limit(2).toString();
        }
        else {
            result= stream.skip(count/2).limit(1).toString();
        }

        return result;
    }
}
