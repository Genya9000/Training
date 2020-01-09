package ml.khaliman.codeWars;

import java.util.Arrays;

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
    public static int[] twoSum(int[] numbers, int target)
    {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static String toCamelCase(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }
}
