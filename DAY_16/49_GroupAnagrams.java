package Sugasri_HOPE_Batch_1.DAY_16;
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());

    }
 //Using hashmap
// class Solution {
//     public int firstUniqChar(String s) {
//         Map<Character,Integer> freq=new HashMap<>();
//         for(char ch:s.toCharArray()){
//             freq.put(ch,freq.getOrDefault(ch,0)+1);
//         }
//         for(int i=0;i<s.length();i++){
//             if(freq.get(s.charAt(i))==1){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }