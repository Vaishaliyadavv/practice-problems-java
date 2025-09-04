package capegeminiPrep.pdfWaleQues;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ques29 {

    public static Character firstNonRepeating(String str) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return null;
    }
    public static void main(String[] args){
        String str = "swiss";

        Character ans = firstNonRepeating(str);
        if (ans != null) {
            System.out.println("First non-repeating character: " + ans);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
