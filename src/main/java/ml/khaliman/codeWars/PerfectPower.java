package ml.khaliman.codeWars;

public class PerfectPower {
    public static int[] isPerfectPower(int n) {

        for (int i = 2; i <=1000 ; i++) {
            for (int j = 2; j <= 1000; j++) {
                if(Math.pow(j, i)== n){

                    return new int[]{j, i};

                }

            }
        }

       return null;
    }
}
