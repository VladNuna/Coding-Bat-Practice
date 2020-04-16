public enum Country {
    /**
     * Enumerator for "Countries" with city and population
     */
    // Country / city / population
    FRANCE("Paris", "2,420,069"),
    GREECE("Athens", "3,090,508"),
    PALAU("Airai", "2,455"),
    ALGERIA("Oran", "1,560,329"),
    HAITI("Port-Margot", "45,360");


    // Private String used to map objects based on enumerator
    private String city;
    private String population;

    /**
     * Constructor that set the city and population based on provided data
     * @param city - The actual city name (String)
     * @param population - The actual population count (String)
     */
    Country(String city, String population){
        this.city = city;
        this.population = population;
    }

    /**
     * @return return city string
     */
    public String getCity() {
        return city;
    }

    /**
     * @return return population string
     */
    public String getPopulation() {
        return population;
    }
}
