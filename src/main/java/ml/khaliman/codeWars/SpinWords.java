package ml.khaliman.codeWars;
import java.util.Arrays;

public class SpinWords {

    public String spinWords(String sentence) {
String result = "";
        String[] arrey = sentence.split(" ");
        for (int i = 0; i <arrey.length ; i++) {
            if(arrey[i].length()>=5){
                StringBuffer buffer = new StringBuffer(arrey[i]);
                arrey[i] = buffer.reverse().toString();
            }
        }
        for (String s:arrey
             ) {
            if(arrey.length!=1){
                result += s+" ";
            }
            result += s;
        }


        return result;
    }
}
