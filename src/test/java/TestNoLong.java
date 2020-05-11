import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestNoLong {
    @Test
    public void TestNoLongBasedOnProvidedData1(){
        ArrayList<String> strings       = new ArrayList<>(Arrays.asList("this", "not", "too", "long"));
        ArrayList<String> expected      = new ArrayList<>(Arrays.asList("not", "too"));
        Assert.assertEquals(expected, NoLong.noLong(strings));
    }

    @Test
    public void TestNoLongBasedOnProvidedData2(){
        ArrayList<String> strings     = new ArrayList<>(Arrays.asList("aaaa", "bbb", "***", "333"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("bbb", "***", "333"));
        Assert.assertEquals(expected, NoLong.noLong(strings));
    }

    @Test
    public void TestNoLongBasedOnProvidedData3(){
        ArrayList<String> strings     = new ArrayList<>(Arrays.asList("a"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a"));
        Assert.assertEquals(expected, NoLong.noLong(strings));
    }
}
