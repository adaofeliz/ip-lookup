package com.adaofeliz.iplookup.service;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Created on 14/12/14.
 */

@Service
public class IpLocationService {

    @Autowired
    private DatabaseReader databaseReader;

    public CityResponse findLocationByIpAddress(String ipAddress) throws IOException, GeoIp2Exception {

        // Creating a InetAddress from the IP Address String
        InetAddress inetAddress = InetAddress.getByName(ipAddress);

        // Using the Database Reader to fetch a city from the InetAddress
        return databaseReader.city(inetAddress);
    }
}
