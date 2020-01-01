package ml.khaliman.codeWars;
public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        int result=0 ;
        if(bounce>0&& bounce<1 && h>0 && h>window ){
            do{
                h *= bounce;
                result++;
            } while (h>window);
            result = 2*result;

        }
        else {result = 0;

        }
        return result-1;
    }
}
