package ml.khaliman.codeWars;
import java.text.DecimalFormat;

public class NthSeries {
    public static String seriesSum(int n) {
        String res = null;
        double result = 1.0;
        if(n == 0){
            res = "0.00";
        }
        else {
            for (int i = 3; i < n * 3; i = i + 3) {
                result += 1.0 / (1+i);
            }
            DecimalFormat df = new DecimalFormat("###.##");

            res = df.format(result);

        }
return res;
    }
}
