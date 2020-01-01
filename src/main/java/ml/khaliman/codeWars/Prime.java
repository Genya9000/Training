package ml.khaliman.codeWars;
public class Prime {
    static int var = 2;
    static boolean result = false;

    public static boolean isPrime(int n) {
        if (n > 1) {
            if (n % var != 0) {
                var++;
                isPrime(n);
            } else if (n % var == 0) {
                if (var == n) {
                    result = true;
                } else {
                    result = false;
                }
            }
        }
        return true;
    }
}
