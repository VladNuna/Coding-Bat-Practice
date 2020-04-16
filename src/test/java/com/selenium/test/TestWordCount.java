import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestWordCount {
    /* The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
     * with a key for each different string, with the value the number of times that string appears
     * in the array.
     */

    @Test
    public void testFirstWorldCountFromString(){
        String[] strings = {"a", "b", "a", "c", "b"};
        Map<String , Integer> expectedMap = new HashMap<String, Integer>(
                Map.of("a",2,"b", 2, "c", 1)
        );

        // wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
        Assert.assertEquals(expectedMap, WordCount.wordCount(strings));
    }

    @Test
    public void testSecondWorldCountFromString(){
        String[] strings = {"c", "b", "a"};
        Map<String , Integer> expectedMap = new HashMap<String, Integer>(
                Map.of("a",1,"b", 1, "c", 1)
        );

        // wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
        Assert.assertEquals(expectedMap, WordCount.wordCount(strings));
    }

    @Test
    public void testThirdWorldCountFromString(){
        String[] strings = {"c", "c", "c", "c"};
        Map<String , Integer> expectedMap = new HashMap<String, Integer>(
                Map.of("c",4)
        );

        // wordCount(["c", "c", "c", "c"]) → {"c": 4}
        Assert.assertEquals(expectedMap, WordCount.wordCount(strings));
    }
}
