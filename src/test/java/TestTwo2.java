import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTwo2 {

    @Test
    public void TestTwo2BasedOnProvidedData1(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4,6));
        Assert.assertEquals(expected, Two2.two2(nums));
    }

    @Test
    public void TestTwo2BasedOnProvidedData2(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList(2,6,11));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4));
        Assert.assertEquals(expected, Two2.two2(nums));
    }

    @Test
    public void TestTwo2BasedOnProvidedData3(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList());
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
        Assert.assertEquals(expected, Two2.two2(nums));
    }
}
