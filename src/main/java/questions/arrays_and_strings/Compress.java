package questions.arrays_and_strings;

public class Compress {
    public static String compress(char[] s) {
        if (s.length == 0) {
            return s.toString();
        }

        StringBuilder compressed = new StringBuilder();
        compressed.append(s[0]);
        Character lastCaracter = s[0];
        int lastCharacterCount = 1;
        for (int i = 0; i < s.length - 1; i++) {
            Character newChar = s[i];
            if (lastCaracter.equals(newChar)) {
                lastCharacterCount++;
            } else {
                compressed.append(lastCharacterCount);
                compressed.append(newChar);
                lastCharacterCount = 1;
            }
        }
        compressed.append(lastCharacterCount);
        return s.length > compressed.length() ? compressed.toString() : s.toString();
    }
}
