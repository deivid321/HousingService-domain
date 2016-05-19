/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deivydas.voroneckis.rest;

import org.springframework.web.client.RestTemplate;

/**
 *
 * @author vdeiv
 */
public class LocationService {
    
    private final String googleApiKey = "AIzaSyCLCOI1ww8yUX_QobmU0fCNoEbaaJf14kE";

    public Location getLocation(String street, int houseNumber){
        RestTemplate restTemplate = new RestTemplate();
        Geocode response = restTemplate.getForObject("https://maps.googleapis.com/maps/api/geocode/json?address=1600+" + street + ",+" + houseNumber + ",+Leuven,+Belgium&key="+googleApiKey, Geocode.class);
        return response.getResults().get(0).getGeometry().getLocation();
    }
    
}
