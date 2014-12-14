package com.adaofeliz.iplookup;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


/**
 * Created on 06/11/14.
 */

@Component
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Main.class) // Web Application base config file
public class AppInitializationTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void testSpringApplicationContextLoad() throws Exception {
        Assert.assertNotNull(context);
    }
}
