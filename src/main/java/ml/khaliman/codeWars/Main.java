package ml.khaliman.codeWars;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMiddle("longer"));

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
