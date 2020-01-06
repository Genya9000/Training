package ml.khaliman.codeWars;
public class Line {
    public static String WhoIsNext(String[] names, int n)
    {
        String result = null;

            result = names[(n%names.length)-1];

        return result;
    }
}
