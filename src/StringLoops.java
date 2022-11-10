import java.io.*;

public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP!
      */
    public int countCharacters(String character, String searchString) {
        int i;
        int sum;
        for (i = 0; i < searchString.length(); i++) {
            int index = 0;
            String temp = searchString;
            if (character.equalsIgnoreCase(temp)) {
                index = character.indexOf(temp);
                temp = searchString.substring(index + 1);
            }
        }
        return i;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
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

