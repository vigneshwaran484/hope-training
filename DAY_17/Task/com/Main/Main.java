package Sugasri_HOPE_Batch_1.DAY_17.Task.com.Main;
import Sugasri_HOPE_Batch_1.DAY_17.Task.com.Service.*;
import Sugasri_HOPE_Batch_1.DAY_17.Task.com.Utilities.DataLoader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        TrieService trie = new TrieService();
        List<String> words = DataLoader.loadWords();
        for (String word : words) {
            trie.insert(word);
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter prefix: ");
            String input = sc.nextLine();
            List<String> suggestions = trie.getSuggestions(input);
            if (suggestions.isEmpty()) {
                System.out.println("No suggestions found");
            } else {
                for (String s : suggestions) {
                    System.out.println(s);
                }
            }
        }
    }
}