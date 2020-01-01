package ml.khaliman.codeWars;
public class isogram {
    public static boolean  isIsogram(String str) {
        boolean result=false;
        int unik = (int) str.toLowerCase().chars().distinct().count();
       int  actual = (int) str.toLowerCase().chars().count();

        return unik == actual;
    }
}
