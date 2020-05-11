import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestDoubleElementList {

    @Test
    public void TestElementDoubleBasedOnProvidedDataUsingForLoop(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList(4,6,8,10));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(8,12,16,20));
        Assert.assertEquals(expected, ElementDouble.doublingUsingFor(nums));
    }

    @Test
    public void TestElementDoubleBasedOnProvidedDataUsingReplaceAll(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList(4,6,8,10));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(8,12,16,20));
        Assert.assertEquals(expected, ElementDouble.doublingUsingReplaceAll(nums));
    }

    @Test
    public void TestElementDoubleBasedOnProvidedDataUsingMap(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList(4,6,8,10));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(8,12,16,20));
        Assert.assertEquals(expected, ElementDouble.doublingUsingMap(nums));
    }
}
