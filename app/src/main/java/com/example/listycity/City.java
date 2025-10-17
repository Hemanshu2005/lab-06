package com.example.listycity;

/**
 * This class defines a City with its name and province.
 */
public class City implements Comparable<City> {
    /** The name of the city */
    private String city;

    /** The name of the province */
    private String province;

    /**
     * Constructs a City object with the given name and province.
     * @param city name of the city
     * @param province name of the province
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the city name.
     * @return name of the city
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * Gets the province name.
     * @return name of the province
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this city to another city by their names alphabetically.
     * @param o another City object
     * @return 0 if equal, positive or negative depending on lexicographic order
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }
}
