import java.util.*;

public class Main {
    public static void main(String[] args) {
        String word= "rishi";
        String rev="";
        for(int i=word.length()-1;i>=0;i--){
            rev=rev+word.charAt(i);
        }
        System.out.println(rev);
    }
}
