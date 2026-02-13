package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a city
 */

public class City  implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructor for a City object.
     * @param city The name of the city.
     * @param province The province of the city.
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the city.
     * @return The city name.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Gets the province of the city.
     * @return The province name.
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * Checks if this city is equal to another object.
     * @param o The object to compare to.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    /**
     * Generates a hash code for the city.
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }

    /**
     * Compares this city to another city for ordering.
     * @param o The city to compare to.
     * @return this city is less than, equal to, or greater than the given city.
     */
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.city);
    }
}
