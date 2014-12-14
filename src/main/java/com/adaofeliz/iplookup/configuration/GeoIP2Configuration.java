package com.adaofeliz.iplookup.configuration;

import com.maxmind.geoip2.DatabaseReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;

/**
 * Created on 14/12/14.
 */

@Configuration
public class GeoIP2Configuration {

    public static final String GEO_LITE_DATABASE_LOCATION = "geolite2/GeoLite2-City.mmdb";

    @Bean
    public DatabaseReader getDatabaseReader() throws IOException {

        // A File object pointing to your GeoIP2 or GeoLite2 database
        File database = new ClassPathResource(GEO_LITE_DATABASE_LOCATION).getFile();

        // This creates the DatabaseReader object, which should be reused across
        // lookups.
        return new DatabaseReader.Builder(database).build();
    }

}
