import java.awt.*;
import java.util.ArrayList;

public class CityWithPopulation {

    ArrayList<Country> cities = new ArrayList<Country>();

    /*
     * Method that populate cities list with proper values taken from Contry Enum file
     */
    public ArrayList<Country> getCities() {
        for(Country country : Country.values()){
            cities.add(country);
        }
        return cities;
    }

    /*
     * Method that prints the citiy list from top to bottom
     */
    public ArrayList<Country>  printAndGetCitiesFromTopBottom() {
        System.out.println("\nTop - Bottom print:");
        ArrayList<Country> topToBottomCities = new ArrayList<Country>();
        for(int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i).name() + "in " + cities.get(i).getCity() + " has " + cities.get(i).getPopulation());
            topToBottomCities.add(cities.get(i));
        }
        return topToBottomCities;
    }

    /*
     * Method that prints the citiy list from bottom to top (reverse list)
     */
    public ArrayList<Country>  printAndGetCitiesFromBottomTop() {
        System.out.println("\nBottom - Top print:");
        ArrayList<Country> bottomToTopCities = new ArrayList<Country>();
        for(int i = cities.size()-1; i>= 0; i--) {
            System.out.println(cities.get(i).name() + "in " + cities.get(i).getCity() + " has " + cities.get(i).getPopulation());
            bottomToTopCities.add(cities.get(i));
        }
        return bottomToTopCities;
    }
}
