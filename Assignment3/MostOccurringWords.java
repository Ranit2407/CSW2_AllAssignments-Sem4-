import java.util.HashMap;

public class MostOccurringWords {
    public static void findMostOccurringWords(String text) {
        String[] words = text.split("\\s+");
        HashMap<String, Integer> wordFreqMap = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            int frequency = wordFreqMap.getOrDefault(word, 0);
            wordFreqMap.put(word, frequency + 1);
        }
        int maxFreq = 0;
        for (String word : wordFreqMap.keySet()) {
            int freq = wordFreqMap.get(word);
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }
        System.out.println("Most occurring words in the string:");
        for (String word : wordFreqMap.keySet()) {
            if (wordFreqMap.get(word) == maxFreq) {
                System.out.println(word + " - Frequency: " + maxFreq);
            }
        }
    }
    public static void main(String[] args) {
        String text = "A quick brown fox jumps over a lazy dog";
        findMostOccurringWords(text);
    }
}
