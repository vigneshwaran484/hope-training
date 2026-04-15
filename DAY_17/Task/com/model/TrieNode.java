package Sugasri_HOPE_Batch_1.DAY_17.Task.com.model;
 
import java.util.HashMap;
import java.util.Map;
public class TrieNode {
    public Map<Character, TrieNode> children;
    public boolean isEnd;
    public TrieNode() {
        children = new HashMap<>();
        isEnd = false;
    }
}