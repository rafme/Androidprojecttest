package com.example.chillern7.beerselection;

/**
 * Created by chillern7 on 6/6/2016.
 */
public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if(color.equal("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
    } else {
            brands.add("Jails Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
}
