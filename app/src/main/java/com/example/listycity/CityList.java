package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of cities
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not already exist
     * @param city
     *          This is a candidate city tp add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns whether or not the given city is in the list.
     * @param city The city to check for.
     * @return True if the city is in the list, false otherwise.
     */
    public boolean hasCity(City city) {
        for (City c : cities) {
            if (c.equals(city)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This deletes a city from the list if the city exists
     * @param city
     *          This is the city to delete
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This returns the number of cities in the list
     * @return
     *          The number of cities
     */
    public int countCities() {
        return cities.size();
    }

    /**
     * This returns the sorted list of cities
     * @return
     *          The list of sorted cities
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
