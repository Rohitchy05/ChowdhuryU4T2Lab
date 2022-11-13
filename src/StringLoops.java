import java.io.*;

public class StringLoops
{
    public StringLoops() { }

    public int countCharacters(String character, String searchString) {
        int count = 0;
        int index = 0;
        for (int i = 0; index != -1; i++) {
            index = searchString.indexOf(character, index);
            if (index != -1) {
                count++;
            }
            index = character.length();
        }
        return count;
    }

    public String reverseString(String origString) {
        char ch;
        String newString = "";
        for (int i = 0; i < origString.length(); i++) {
            ch = origString.charAt(i);
            newString = ch + newString;
        }
        return newString;
    }
}

