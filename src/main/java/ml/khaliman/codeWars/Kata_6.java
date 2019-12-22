package ml.khaliman.codeWars;
import java.util.Arrays;
import java.util.stream.Collectors;


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

        boolean isEven = word.length()%2!=1;
        Object[] ints = word.chars().mapToObj(i -> (char)i).toArray();
        String subString;


        if(isEven){
            /*result= stream.skip(word.length()/2 -1).limit(2).toArray();*/
            subString = Arrays.stream(ints,word.length()/2 -1,word.length()/2+1).
                    map(i -> (char)i).
                    map(String::valueOf).
                    collect(Collectors.joining());
        }
        else {
            subString = Arrays.stream(ints,word.length()/2 -1,word.length()/2).
                    map(i -> (char)i).
                    map(String::valueOf).
                    collect(Collectors.joining());
        }

        return subString;
    }
}
