import org.junit.Assert;
import org.junit.Test;

public class TestStartWord {
    /*
     * Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
     * except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string.
     * So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
     * startWord("hippo", "hi") → "hi"
     * startWord("hippo", "xip") → "hip"
     * startWord("hippo", "i") → "h"
     */

    @Test
    public void startWordFirstTestsUsingLastIndexOf(){
        StartWord testData = new StartWord("hippo", "hi");
        Assert.assertEquals("hi", testData.getWordUsingLastIndexOf());  //→ "hi"

        testData = new StartWord("hippo", "xhi");
        Assert.assertEquals("hip", testData.getWordUsingLastIndexOf()); //→ "hip"

        testData = new StartWord("hippo", "i");
        Assert.assertEquals("h", testData.getWordUsingLastIndexOf()); //→ "h"
    }

    @Test
    public void startWordFirstTestsUsingSplitAndConcat(){
        StartWord testData = new StartWord("hippo", "hi");
        Assert.assertEquals("hi", testData.getWordUsingSplitAndConcat());  //→ "hi"

        testData = new StartWord("hippo", "xip");
        Assert.assertEquals("hip", testData.getWordUsingSplitAndConcat()); //→ "hip"

        testData = new StartWord("hippo", "i");
        Assert.assertEquals("h", testData.getWordUsingSplitAndConcat()); //→ "h"
    }

}
