package com.adaofeliz.iplookup.web.controller;

import com.adaofeliz.iplookup.web.service.IpLocationService;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created on 14/12/14.
 */

@RestController
@RequestMapping("/api/*")
public class ServiceController {

    @Autowired
    private IpLocationService ipLocationService;

    @RequestMapping(value = "/location", method = RequestMethod.GET)
    public CityResponse findLocation(HttpServletRequest httpServletRequest) throws IOException, GeoIp2Exception {
        return ipLocationService.findLocationByIpAddress(httpServletRequest.getRemoteAddr());
    }

    @RequestMapping(value = "/location/{ipAddress}", method = RequestMethod.GET)
    public CityResponse findLocationByIpAddress(@PathVariable String ipAddress) throws IOException, GeoIp2Exception {
        return ipLocationService.findLocationByIpAddress(ipAddress);
    }

}
