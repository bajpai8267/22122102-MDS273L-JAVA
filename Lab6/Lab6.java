import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab6 {
    public static void main(String[] args) {
        // read file and get its content as a string
        String content = readFile("text.txt");

        // find and print vowels and their count
        Map<Character, Integer> vowelsCount = findCharactersCount(content, "AEIOUaeiou");
        System.out.println("Vowels count:");
        System.out.println(vowelsCount);

        // find and print digits and their count
        Map<Character, Integer> digitsCount = findCharactersCount(content, "0123456789");
        System.out.println("Digits count:");
        System.out.println(digitsCount);

        // find and print top five repeated words and their count
        Map<String, Integer> wordsCount = findWordsCount(content);
        System.out.println("Top five repeated words:");
        printTopAndLeastWords(wordsCount, true);

        // find and print least five repeated words and their count
        System.out.println("Least five repeated words:");
        printTopAndLeastWords(wordsCount, false);

        // find and print top five repeated characters and their count
        System.out.println("Top five repeated characters:");
        printTopAndLeastCharacters(vowelsCount, digitsCount, true);

        // find and print least five repeated characters and their count
        System.out.println("Least five repeated characters:");
        printTopAndLeastCharacters(vowelsCount, digitsCount, false);
    }

    private static void printTopAndLeastCharacters(Map<Character, Integer> vowelsCount,
            Map<Character, Integer> digitsCount, boolean b) {
    }

    // read file and return its content as a string
    private static String readFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            System.exit(1);
        }
        return content.toString();
    }

    // find characters in the given content and return their count
    private static Map<Character, Integer> findCharactersCount(String content, String characters) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < content.length(); i++) {
            char c = content.charAt(i);
            if (characters.indexOf(c) >= 0) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
        }
        return count;
    }

    // find words in the given content and return their count
    private static Map<String, Integer> findWordsCount(String content) {
        Map<String, Integer> count = new HashMap<>();
        String[] words = content.split("\\s+");
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        return count;
    }

    // print top or least five words and their count
    private static void printTopAndLeastWords(Map<String, Integer> wordsCount, boolean isTop) {
        List<Map.Entry<String, Integer>> sortedWordsCount = new ArrayList<>(wordsCount.entrySet());
        if (isTop) {
            sortedWordsCount.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        } else {
            sortedWordsCount.sort(Map.Entry.<String, Integer>comparingByValue());
        }
        for (int i = 0; i < 5 && i < sortedWordsCount.size(); i++) {
            Map.Entry<String, Integer> wordCount = sortedWordsCount.get(i);
            System.out.println(wordCount.getKey() + ": " + wordCount.getValue());
        }
    }
}

   
