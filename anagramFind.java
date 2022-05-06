import java.util.*;

public class anagramFind{
    public static void main(String[] args){
      
      String word="rishi";
      String ana = "Riihsk";
      
        word = revString(word);
        ana  = revString(ana);
        
        if(word.equals(ana))
            System.out.println("both are anagram");
    }
    
   public static String revString(String s){
      
      char[] revChar = s.toLowerCase().toCharArray();
      Arrays.sort(revChar);
      return String.valueOf(revChar);
    }
}
