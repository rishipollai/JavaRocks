import java.util.*;

public class findDuplicate{
     public static void main(String[] args){
           String name = "rishi";
           
           HashMap<Character,Integer> hasmap = new HashMap<>();
           
           for(int i=0;i<=name.length()-1;i++){
                char ch = name.charAt(i);
                
                if(hasmap.containsKey(ch)){
                    hasmap.put(ch, hasmap.get(ch) + 1);
                }
                else{
                    hasmap.put(ch,1);
                }
           }
           
           for (Map.Entry<Character,Integer> e : hasmap.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
     }
}
