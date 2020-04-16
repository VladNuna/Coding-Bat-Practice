import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestMakeBricks {

    @Test
    public void testMakeBricksAll(){

        //makeBricks(3, 1, 8) → true
        Assert.assertEquals(true, MakeBricks.makeBricks(3, 1, 8));

        //makeBricks(3, 1, 9) → false
        Assert.assertEquals(false, MakeBricks.makeBricks(3, 1, 9));

        //makeBricks(3, 2, 10) → true
        Assert.assertEquals(true, MakeBricks.makeBricks(3,2,10));
    }

}
