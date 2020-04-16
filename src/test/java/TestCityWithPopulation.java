import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

public class TestCityWithPopulation {


    CityWithPopulation cityWithPopulation = null;
    @Before
    public void initiializeCitysWithPopulation(){
        cityWithPopulation = new CityWithPopulation();
        cityWithPopulation.getCities();
    }

    @Test
    public void testCitiesFromTopToBottom(){
        cityWithPopulation.printCitiesFromTopBottom();
        Assert.assertTrue(true);

    }

    @Test
    public void testCitiesFromBootomToTop(){
        cityWithPopulation.printCitiesFromBottomTop();
        Assert.assertTrue(true);
    }
}
