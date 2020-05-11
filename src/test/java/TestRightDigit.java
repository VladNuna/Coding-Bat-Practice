import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestRightDigit {
    @Test
    public void TestRightDigitBasedOnProvidedDataUsingForLoop(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList(1,22,93));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3));
        Assert.assertEquals(expected, ElementDouble.doublingUsingFor(nums));
    }

    @Test
    public void TestRightDigitBasedOnProvidedDataUsingReplaceAll(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList(16,8,886,8,1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6,8,6,8,1));
        Assert.assertEquals(expected, ElementDouble.doublingUsingReplaceAll(nums));
    }

    @Test
    public void TestRightDigitBasedOnProvidedDataUsingMap(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList(5, 50, 500, 5000, 5000));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 0, 0, 0, 0));
        Assert.assertEquals(expected, ElementDouble.doublingUsingMap(nums));
    }
}
