package ml.khaliman.codeWars;
import java.util.Arrays;

public class FindOutlier {
   public static int find(int[] integers){
       int[] result = null;
       result = Arrays.stream(integers).filter(x-> (x%2==0)).count()==1? Arrays.stream(integers).filter(x-> (x%2==0))
               .toArray() : Arrays.stream(integers).filter(x-> (x%2==1)).toArray();
        return result[0];
}
    }
