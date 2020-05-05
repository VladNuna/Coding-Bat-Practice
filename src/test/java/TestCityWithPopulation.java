import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;

public class TestCityWithPopulation {


    CityWithPopulation cityWithPopulation = null;
    @Before
    public void initiializeCitysWithPopulation(){
        cityWithPopulation = new CityWithPopulation();
        cityWithPopulation.getCities();
    }

    @Test
    public void testCitiesFromTopToBottom(){
        ArrayList<Country> topToBottomCitiesList = cityWithPopulation.printAndGetCitiesFromTopBottom();
        Assert.assertEquals(cityWithPopulation.cities.get(0), topToBottomCitiesList.get(0));
    }

    @Test
    public void testCitiesFromBootomToTop(){
        ArrayList<Country> bottomToTopCitiesList = cityWithPopulation.printAndGetCitiesFromBottomTop();
        Assert.assertEquals(cityWithPopulation.cities.get(bottomToTopCitiesList.size() - 1), bottomToTopCitiesList.get(0));
    }
}
