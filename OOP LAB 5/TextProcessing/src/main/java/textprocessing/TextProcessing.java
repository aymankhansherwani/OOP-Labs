package textprocessing;
public class TextProcessing {

    public static void main(String[] args) {
        String word = "aymankhan";
        String reversedWord = reverseWord(word);
        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversedWord);
    }
    public static String reverseWord(String word) {
        if (word.isEmpty()) {
            return word;  
        }
        return word.charAt(word.length() - 1) + reverseWord(word.substring(0, word.length() - 1));
    }
}
