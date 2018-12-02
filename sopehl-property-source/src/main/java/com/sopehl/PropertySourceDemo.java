package com.sopehl;

import com.sopehl.properties.ApplicationConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PropertySourceDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertySourceDemo.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(PropertySourceDemo.class, args);
        ApplicationConfig applicationConfig = applicationContext.getBean(ApplicationConfig.class);

        LOGGER.info(applicationConfig.getApplicationName());
    }

}
