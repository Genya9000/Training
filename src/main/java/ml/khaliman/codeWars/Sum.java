package ml.khaliman.codeWars;
public class Sum
{
    public int GetSum(int a, int b)

    {
        int result= 0;
        int count = Math.abs(b-a);
        if(a==b){
            result = b;
        }
else {

if(a<b){
    for (int i = a; i <=b ; i++) {
        result +=i;
    }

}
else {
    for (int i = b; i <=a ; i++) {
        result +=i;
    }
}

        }

        return result;
    }
}
