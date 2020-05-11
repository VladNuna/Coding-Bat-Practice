import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestNextSmallestElement {

    @Test
    public void TestNextSmallestElementBasedOnProvidedData1(){
        int nums[] = {4, 20, 10, 3, -5, 2, -6};
        int expected[] = {-6,-6,-6,-6,-6,-6,-1};
        int result[] = NextSmallestElement.nextSmallestNumOrder(nums);

        Assert.assertTrue(Arrays.equals(expected, result));
    }
}
