import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.util.Map.*;

public class TestMapBully {

    /* Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
     * and set the key "a" to have the value "".
     * Basically "b" is a bully, taking the value and replacing it with the empty string.
     */
    @Test
    public void testmapFirstBully(){
        Map<String , String> map = new HashMap<String, String>(
                Map.of("a","candy","b", "dirt")
        );
        Map<String , String> expectedMap = new HashMap<String, String>(
                Map.of("a","","b", "candy")
        );
        // mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
        Assert.assertEquals(expectedMap, MapBully.mapBully(map));
    }

    @Test
    public void testmapSecondBully(){

        Map<String , String> map = new HashMap<String, String>(
                Map.of("a","candy")
        );
        Map<String , String> expectedMap = new HashMap<String, String>(
                Map.of("a","","b", "candy")
        );
        // mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
        Assert.assertEquals(expectedMap, MapBully.mapBully(map));

    }

    @Test
    public void testmapThirdBully(){
        Map<String , String> map = new HashMap<String, String>(
                Map.of("a","candy", "b", "carrot", "c", "meh")
        );
        Map<String , String> expectedMap = new HashMap<String, String>(
                Map.of("a","","b", "candy", "c", "meh")
        );
        //mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
        Assert.assertEquals(expectedMap, MapBully.mapBully(map));

    }
}
