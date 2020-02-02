package ml.khaliman.codeWars;
import java.util.ArrayList;
import java.util.List;

public class BalancedParens {

    public static List<String> balancedParens (int n) {
        List<String> result = new ArrayList<>(n);
        balancedParens("", n, 0, 0, result);
        return result;
    }

    private static void balancedParens(String str, int n, int numOpens, int numCloses, List<String> list) {
        if(numCloses == n) {
            list.add(str);
            return;
        }
        if(numOpens < n) {
            balancedParens(str + "(", n, numOpens + 1, numCloses, list);
        }
        if(numOpens > 0 && numCloses < numOpens) {
            balancedParens(str + ")", n, numOpens, numCloses + 1, list);
        }
    }
}