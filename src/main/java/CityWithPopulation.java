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
    public void printCitiesFromTopBottom() {
        System.out.println("\nTop - Bottom print:");
        for(int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i).name() + "in " + cities.get(i).getCity() + " has " + cities.get(i).getPopulation());
        }
    }

    /*
     * Method that prints the citiy list from bottom to top (reverse list)
     */
    public void printCitiesFromBottomTop() {
        System.out.println("\nBottom - Top print:");
        for(int i = cities.size()-1; i>= 0; i--) {
            System.out.println(cities.get(i).name() + "in " + cities.get(i).getCity() + " has " + cities.get(i).getPopulation());
        }
    }
}
