package com.adaofeliz.iplookup.web.controller.advice;

import com.maxmind.geoip2.exception.AddressNotFoundException;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created on 14/12/14.
 */

@ControllerAdvice
public class ServiceControllerAdvice {

    @ExceptionHandler(AddressNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void addressNotFoundExceptionExceptionHandler() { }


    @ExceptionHandler(GeoIp2Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void geoIp2ExceptionExceptionHandler() { }

}
