package ml.khaliman.codeWars;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

     /*   System.out.println(40300%1000);
        Main.expandedForm(545);

    }
    public static String expandedForm(int num)
    {
        String result = null;
        List<Integer> nums = new ArrayList<>();
        while (num != 0) {
            nums.add(num % 10);
            num /= 10;
        }
        Collections.reverse(nums);
        Object[] res = nums.toArray(new Integer[0]);
        for (int i = 0; i <res.length ; i++) {
            double resDouble = (double) res[i];
            resDouble *= Math.pow(10, res.length - 1 - i);
            res[i] = (int)resDouble;
        }
        res = Arrays.stream(res).filter(x->x.equals(0)).toArray();
        for (int i = 0; i <res.length ; i++) {
            result += Integer.toString((Integer) res[i])+" + ";
        }

        return result.substring(0, result.length()-3);*/
        /*System.out.println(7230702951L%5);
*/
        String[] res = new String[]{"sdsd", "ds", "s", "fdgdfg"};
        System.out.println(Arrays.stream(res).max((x1, x2) -> Integer.compare(x1.length(), x2.length())).get());
        }
}
