package ml.khaliman.Task_6_1;
public class Application {
    public static void main(String[] args) {
        String s = args[0];
        s = code(s);
        if (!args[0].equals(" "))
            System.out.println(s);
        System.out.println(" ");
    }

    private static String code(String s) {
        StringBuilder temp = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
                continue;
            }
            temp.append(s.charAt(i)).append(count).append(" ");
            count = 1;
        }
        temp.append(s.charAt(s.length() - 1)).append(count);
        return temp.toString();
    }
}
