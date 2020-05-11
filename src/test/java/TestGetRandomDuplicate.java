import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestGetRandomDuplicate {

    @Test
    public void TestElementDoubleBasedOnProvidedDataUsingForLoop(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList(4,4,6,8,11,10,6,8,10));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4,6,8,10));
        Assert.assertTrue(expected.contains(GetRandomDuplicate.getRandomDuplicateNumberUsingForLoop(nums)));
    }

    @Test
    public void TestElementDoubleBasedOnProvidedDataUsingHashSet(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList(4,4,6,8,11,10,6,8,10));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4,6,8,10));
        Assert.assertTrue(expected.contains(GetRandomDuplicate.getRandomDuplicateNumberUsingHashSet(nums)));
    }


    @Test
    public void TestElementDoubleBasedOnProvidedDataUsingGroupBy(){
        ArrayList<Integer> nums     = new ArrayList<>(Arrays.asList(4,4,6,8,11,10,6,8,10));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4,6,8,10));
        Assert.assertTrue(expected.contains(GetRandomDuplicate.getRandomDuplicateNumberUsingGroupBy(nums)));
    }


}
