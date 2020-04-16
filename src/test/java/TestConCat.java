import org.junit.Assert;
import org.junit.Test;

public class TestConCat {

    /*
     * Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the concatenation creates a double-char,
     * then omit one of the chars, so "abc" and "cat" yields "abcat".
     *
     * conCat("abc", "cat") → "abcat"
     * conCat("dog", "cat") → "dogcat"
     * conCat("abc", "") → "abc"
     * */

    @Test
    public void testConcatenationWithoutCharactersRemovedInRow(){
        ConCat testData = new ConCat("abc", "cat");
        Assert.assertEquals("abct", testData.getConCatStringWithDuplicateCharactersRemovedInRow(false));  //→ "abcat"

        testData = new ConCat("dog", "cat");
        Assert.assertEquals("dogcat", testData.getConCatStringWithDuplicateCharactersRemovedInRow(false)); //→ "dogcat"

        testData = new ConCat("abc", "");
        Assert.assertEquals("abc", testData.getConCatStringWithDuplicateCharactersRemovedInRow(false)); //→ "abc"
    }

    @Test
    public void testConcatenationWithCharactersRemovedInRow(){
        ConCat testData = new ConCat("abc", "cat");
        Assert.assertEquals("abcat", testData.getConCatStringWithDuplicateCharactersRemovedInRow(true));  //→ "abcat"

        testData = new ConCat("dog", "cat");
        Assert.assertEquals("dogcat", testData.getConCatStringWithDuplicateCharactersRemovedInRow(true)); //→ "dogcat"

        testData = new ConCat("abc", "");
        Assert.assertEquals("abc", testData.getConCatStringWithDuplicateCharactersRemovedInRow(true)); //→ "abc"
    }

}
