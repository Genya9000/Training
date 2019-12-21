package ml.khaliman.codeWars;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //getMiddle("Ponya");
        //System.out.println(getMiddle("Ponya").toString());
        System.out.println(getMiddle("longer"));
        String a = "Kolya";

        System.out.println(a.toCharArray());
    }
    public static String getMiddle(String word) {
        char[] result = word.toCharArray();
                boolean isEven = word.length()%2!=1;
        if(isEven){
            result= Arrays.stream(result).skip(word.length()/2 -1).limit(2).toArray();
        }
        else {
            result= Arrays.stream(result).skip(word.length()/2).limit(1).toArray();
        }

        return Arrays.toString(result);
    }
}
