package Sugasri_HOPE_Batch_1.DAY_14.VsCode;
import java.util.*;
public class FrequencyImplementation {
    public static void main(String[] args) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        String s="aazzzzbbbcc";
        for (char c : s.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        System.out.println(frequencyMap);
        for(Map.Entry<Character,Integer> entry:frequencyMap.entrySet()){
            System.out.println(entry.getKey()+ ":"+entry.getValue());
        }
    }

}
