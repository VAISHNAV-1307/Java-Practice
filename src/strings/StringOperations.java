package strings;

public class StringOperations {

    public String getReversedString(String input) {
        char[] charArray = input.toCharArray();
        for (int i = charArray.length - 1, l = 0; i >= l; i--, l++) {
            char temp = charArray[l];
            charArray[l] = charArray[i];
            charArray[i] = temp;
        }
        return new String(charArray);
    }


}
