public class ConCat {

    private String firstString;
    private String secondString;

    public ConCat(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    public String getConCatStringWithDuplicateCharactersRemovedInRow(boolean removeDuplicateCharacersInRow)
    {
        if(removeDuplicateCharacersInRow)
            return conCat(firstString, secondString, removeDuplicateCharacersInRow);
        else
            return conCat(firstString, secondString, removeDuplicateCharacersInRow);
    }
    /***
     * Method that concatenets two strings and returns it calls another method in order to remove duplicate characters
     *
     * @param firstString First string element that is used to concatenation
     * @param secondString The second string element that is concateneted with the first one
     * @return Based on selection it returns a String with:
     *      removeDuplicateCharacters returns a string with no duplicate characters if they are nerby aa -> a and abccatc -> abcat
     *      removeDuplicateCharactersInRow returns a string with no duplicate characters nerby cc -> c and abaccatc -> abccatc
     */
    private static String conCat(String firstString, String secondString, boolean removeDuplicateCharacersInRow){
        String concatString = firstString.concat(secondString);
        return removeDuplicateCharacersInRow ? removeDuplicateCharactersInRow(concatString) : removeDuplicateCharacters(concatString);
    }

    /***
     * The method that removes duplicate characters and creates as tring builder that is transformed to string by the end of the for loop
     *
     * @param word Provided concatenated string that needs to be cleaned
     * @return A string with no duplicate characters.
     */
    private static String removeDuplicateCharacters(String word){
        final StringBuilder output = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            String character = word.substring(i, i + 1);    // get i character and next one to this i+1
            if (output.indexOf(character) < 0)              // Check if stringbuilder output contains that character and if not add to that
                output.append(character);
        }
        return output.toString();
    }

    /***
     * The method that removes duplicate characters and creates as tring builder that is transformed to string by the end of the for loop
     *
     * @param word Provided concatenated string that needs to be cleaned
     * @return returns a string with no duplicate characters to ecah other cc -> c and abaccatc -> abccatc
     */
    private static String removeDuplicateCharactersInRow(String word){
        final StringBuilder output = new StringBuilder();
        char[] ch = new char[2];
        for (int i = 0; i < word.length(); i++) {
            if(i > 0) {
                ch[0] = word.charAt(i - 1);     // get i character and next one to this i+1
                ch[1] = word.charAt(i);
                if (ch[0] != ch[1])              // Check if stringbuilder output contains that character and if not add to that
                    output.append(ch[1]);
            }else{
                // Add first character in string Builder
                output.append(word.charAt(i));
            }
        }
        return output.toString();
    }

}
