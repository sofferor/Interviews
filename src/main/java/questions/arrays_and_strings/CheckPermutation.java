package questions.arrays_and_strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckPermutation {
    public static boolean isPermutation(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        Map<Character, Integer> firstCharactersCount = buildCharactersCountMap(s1);
        Map<Character, Integer> secondCharactersCount = buildCharactersCountMap(s2);

        if (firstCharactersCount.size() != secondCharactersCount.size()) {
            return false;
        }
        for (Map.Entry<Character, Integer> entry: firstCharactersCount.entrySet()) {
            if (!secondCharactersCount.containsKey(entry.getKey())) {
                return false;
            }
            if (!entry.getValue().equals(secondCharactersCount.get(entry.getKey()))) {
                return false;
            }
        }
        
        return true;
    }

    private static Map<Character, Integer> buildCharactersCountMap(String s) {
        Map<Character, Integer> charactersCount = new HashMap<>();
        for (Character character: s.toCharArray()) {
            int count = 1;
            if (charactersCount.containsKey(character)) {
                count = charactersCount.get(character) + 1;
            }
            charactersCount.put(character, count);
        }
        return charactersCount;
    }

    public static boolean isPermutationWithArray(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        List<Integer> firstCharactersCount = buildCharactersCountList(s1);
        List<Integer> secondCharactersCount = buildCharactersCountList(s2);

        for (int i = 0; i < firstCharactersCount.size(); i++) {
            if (!firstCharactersCount.get(i).equals(secondCharactersCount.get(i))) {
                return false;
            }
        }

        return true;
    }

    private static List<Integer> buildCharactersCountList(String s) {
        List<Integer> charactersCount = new ArrayList<>(256);

        for (Character c : s.toCharArray()) {
            Integer count = charactersCount.get(c);
            count = count != null ? count + 1 : 1;
            charactersCount.add(c, count);
        }

        return charactersCount;
    }
}
