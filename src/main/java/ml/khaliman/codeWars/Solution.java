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
    public static int zeros(int n) {
        int rez = 0;
        /*int factorial = 1;
        for (int i = 3; i >=1 ; i--) {
            factorial*= i;
        }*/
        while(n > 0)

        {

            n /= 5;

            rez += n;

        }

        return rez;
    }
}
