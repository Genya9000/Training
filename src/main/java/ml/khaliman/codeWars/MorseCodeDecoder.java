package ml.khaliman.codeWars;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MorseCodeDecoder {

    public static String decodeBits(String bits) {
        bits = bits.replaceAll("^0+|0+$", "");
        int rate = Integer.MAX_VALUE;
        Matcher matcher = Pattern.compile("1+|0+").matcher(bits);
        while (matcher.find()) rate = Math.min(rate, matcher.group().length());
        return bits
                .replaceAll("1{"+ (3 * rate) +"}", "-")
                .replaceAll("1{"+ (1 * rate) +"}", ".")
                .replaceAll("0{"+ (7 * rate) +"}", "   ")
                .replaceAll("0{"+ (3 * rate) +"}", " ")
                .replaceAll("0{"+ (1 * rate) +"}", "");
    }

    public static String decodeMorse(String morseCode) {
        return Arrays
                .stream(morseCode.trim().split("   "))
                .map(i -> Arrays.stream(i.split(" "))
                        .map(l -> MorseCode.get(l))
                        .collect(Collectors.joining()))
                .collect(Collectors.joining(" "));
    }
}