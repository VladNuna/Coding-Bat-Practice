import java.util.HashMap;
import java.util.Map;

public class WordCount {

    /**
     * Method that takes a list of charactes and counts each caracter and returns a hashMap
     * @param strings The test data string data (character list)
     * @return the result as hashmap with keys and values
     */
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s:strings) {

            if (!map.containsKey(s)) {  // first time we've seen this string
                map.put(s, 1);
            }
            else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;
    }
}
