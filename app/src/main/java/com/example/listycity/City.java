package com.example.listycity;

/**
 * This is a class that defines a city
 */

public class City  implements Comparable<City> {
    private String city;
    private String province;

    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }
    public String getProvince() {
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.city);
    }
}
