package ml.khaliman.codeWars;
public class Solution {
    public static String whoLikesIt(String... names) {

        StringBuilder stringBuffer = new StringBuilder();
        if(names.length==0){
            stringBuffer.append("no one likes this");
        }
        else if(names.length==1) {
            stringBuffer.append(names[0] + " likes this");
        }
        else if(names.length ==2){
            stringBuffer.append(names[0] + " and " + names[1] +" like this");
        }
        else if(names.length == 3) {
            stringBuffer.append(names[0] + ", " + names[1] + " and " + names[2] + " like this");
        }
        else {
            stringBuffer.append(names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this");
        }
        return stringBuffer.toString();
    }
}
