public class MyString {
    public int numberOfCharacter(String string) {
        return string.length();
    }

    public String concatenateString(String string1, String string2, String string3) {
        return string1.concat(string2).concat(string3);
    }

    public boolean stringStartWithVowel(String string) {

        return (string.toLowerCase().charAt(0) == 'a') ||
                (string.toLowerCase().charAt(0) == 'e') ||
                (string.toLowerCase().charAt(0) == 'i') ||
                (string.toLowerCase().charAt(0) == 'o') ||
                (string.toLowerCase().charAt(0) == 'u');
    }

    public String reverseString(String string) {
        char[] chars = string.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }
        return new String(chars);
    }
}


