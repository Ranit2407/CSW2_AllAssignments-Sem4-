import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.next();
        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.next();
        int wordIndex = sentence.indexOf(wordToReplace);
        if (wordIndex != -1) {
            String newSentence = sentence.substring(0, wordIndex) +
                    replacementWord +
                    sentence.substring(wordIndex + wordToReplace.length());
            System.out.println("Original sentence: " + sentence);
            System.out.println("Modified sentence: " + newSentence);
        } else {
            System.out.println("Word not found in the sentence.");
        }
    }
}
