public class StartWord {
    private String str, word;

    public StartWord(String str, String word) {
        this.str = str;
        this.word = word;
    }

    /**
     * Returns a String as a result string if 2nd parameter is found in the first paramenter used otherwhise it returns ""
     *
     * @param  str The base string that we use to find a specific keyword
     * @param  word the word we need to find in order to return a string result otherwhise return ""
     * @return      String result
     */
    public String getWordUsingLastIndexOf(){
        if(str.contains(word.substring(1, word.length())) && word.length() > 1){
            return str.substring(0, word.length());
        }else{
            int index = str.lastIndexOf(this.word) == -1 ? 0 : str.lastIndexOf(word); // exclude 1st character
            return str.substring(0, index);
        }
    }

    /**
     * Returns a String as a result string if 2nd parameter is found in the first paramenter used otherwhise it returns ""
     *
     * @param  str The base string that we use to find a specific keyword
     * @param  word the word we need to find in order to return a string result otherwhise return ""
     * @return      String result
     */
    public String getWordUsingSplitAndConcat(){
        if(str.contains(word.substring(1, word.length())) && word.length() > 1){
            String ragexString = word.substring(1, word.length());
            return str.split(ragexString,word.length())[0].concat(ragexString); // exclude 1st character
        }else{
            String ragexString = word.substring(0, word.length());
            String result = str.split(ragexString).length > 1 ? str.split(ragexString)[0] : "";
            return result;
        }
    }
}
