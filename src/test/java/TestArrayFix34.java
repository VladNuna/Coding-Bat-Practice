import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestArrayFix34 {

    @Test
    public void TestArrayFix34BasedOnProvidedData1(){
        int [] testData = {1,3,1,4};
        int [] expectedData = {1,3,4,1};

        //fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
        int [] result = ArrayFix34.fix34(testData);
        Assert.assertTrue(Arrays.equals(result, expectedData));
    }

    @Test
    public void TestArrayFix34BasedOnProvidedData2(){
        int [] testData = {1,3,1,4};
        int [] expectedData = {1,3,4,1};

        //fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
        int [] result = ArrayFix34.fix34(testData);
        Assert.assertTrue(Arrays.equals(result, expectedData));
    }

    @Test
    public void TestArrayFix34BasedOnProvidedData3(){
        int [] testData = {1,3,1,4};
        int [] expectedData = {1,3,4,1};

        //fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
        int [] result = ArrayFix34.fix34(testData);
        Assert.assertTrue(Arrays.equals(result, expectedData));
    }
}
