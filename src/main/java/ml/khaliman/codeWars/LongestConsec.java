package ml.khaliman.codeWars;
import java.util.Arrays;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        String ex = "";
        StringBuilder result= new StringBuilder();
        if(strarr.length==0 || k>strarr.length || k<=0){
            ex = "";
        }
        String max = Arrays.stream(strarr).max((x1, x2) -> Integer.compare(x1.length(), x2.length())).orElseGet(String::new);
        for (String ar:strarr
             ) {
            if(ar.equals(max)){
                for (int i = Arrays.asList(strarr).indexOf(ar); i < Arrays.asList(strarr).indexOf(ar)+k; i++) {
ex = result.append(strarr[i]).toString();

                }
                break;
            }
        }

        return ex;
    }
}
