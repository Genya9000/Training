package ml.khaliman.codeWars;
public class BraceChecker {

    public boolean isValid(String braces) {
        int lengthOfBraces = braces.length();
        for(int i = 0; i < lengthOfBraces; i++){
            braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
        }
        return braces.isEmpty();
    }


}
