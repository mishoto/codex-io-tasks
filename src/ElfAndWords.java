import java.util.HashMap;

public class ElfAndWords {

    static HashMap<Character, Integer> characterCount(String word) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] strArray = word.toCharArray();
        for (char c : strArray) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        return new HashMap<>(charMap);
    }

    static int removeDuplicates(String firstWord, String secondWord){
        HashMap<Character, Integer> charMapFirst = characterCount(firstWord);
        HashMap<Character, Integer> charMapSecond = characterCount(secondWord);
        int counter = 0;
        for (char c: secondWord.toCharArray()) {
            if(charMapFirst.containsKey(c)){
                counter++;
            }
        }
        for (char c: firstWord.toCharArray()) {
            if(charMapSecond.containsKey(c)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        String firstWord = "codewars";
        String secondWord = "hackerrank";
        System.out.println(removeDuplicates(firstWord, secondWord));
    }
}
