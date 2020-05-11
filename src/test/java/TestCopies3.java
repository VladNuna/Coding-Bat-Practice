import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCopies3 {

    @Test
    public void TestCopies3BasedOnProvidedDataUsingForLoop(){
        ArrayList<String> strings     = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("aaa", "bbbbbb", "ccccccccc"));
        Assert.assertEquals(expected, Copies3.copies3UsingFor(strings));
    }

    @Test
    public void TestCopies3BasedOnProvidedDataUsingReplaceAll(){
        ArrayList<String> strings     = new ArrayList<>(Arrays.asList("hello", "there"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("hellohellohello", "theretherethere"));
        Assert.assertEquals(expected, Copies3.copies3UsingReplaceAll(strings));
    }

    @Test
    public void TestCopies3BasedOnProvidedDataUsingMap(){
        ArrayList<String> strings     = new ArrayList<>(Arrays.asList("this", "that", "and"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("thisthisthis", "thatthatthat", "andandand"));
        Assert.assertEquals(expected, Copies3.copies3UsingMap(strings));
    }
}
