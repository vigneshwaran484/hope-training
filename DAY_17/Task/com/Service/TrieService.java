package Sugasri_HOPE_Batch_1.DAY_17.Task.com.Service;

import Sugasri_HOPE_Batch_1.DAY_17.Task.com.model.*;
import java.util.*;
public class TrieService {
    private TrieNode root;
    public TrieService() {
        root = new TrieNode();
    }
    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            if (!current.children.containsKey(ch)) {
    current.children.put(ch, new TrieNode());
            current = current.children.get(ch);
        }
        current.isEnd = true;
    }
    public List<String> getSuggestions(String prefix) {
        List<String> results = new ArrayList<>();
        TrieNode current = root;
        for (char ch : prefix.toCharArray()) {
            if (!current.children.containsKey(ch)) {
                return results;
            }
            current = current.children.get(ch);
        }
        dfs(current, prefix, results);
        Collections.sort(results);
        return results.subList(0, Math.min(5, results.size()));
    }
    private void dfs(TrieNode node, String word, List<String> results) {
        if (node.isEnd) {
            results.add(word);
        }

        for (char ch : node.children.keySet()) {
            dfs(node.children.get(ch), word + ch, results);
        }
    }
}
