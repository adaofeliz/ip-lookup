package com.adaofeliz.iplookup.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created on 14/12/14.
 */

@Configuration
public class WebConfiguration extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Static Resources Mapping
        registry.addResourceHandler("/*")
                .addResourceLocations("/web/")
                .setCachePeriod(0);
    }
}
