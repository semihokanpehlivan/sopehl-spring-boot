package com.sopehl;

import com.sopehl.properties.ApplicationConfig;
import com.sopehl.properties.ConfigFromFile;
import com.sopehl.properties.MultipleConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PropertySourceDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertySourceDemo.class);

    public static void main(String[] args) {
        System.setProperty("test.config.path", "/Users/semihokan");

        ConfigurableApplicationContext applicationContext = SpringApplication.run(PropertySourceDemo.class, args);

        ApplicationConfig applicationConfig = applicationContext.getBean(ApplicationConfig.class);
        MultipleConfig multipleConfig = applicationContext.getBean(MultipleConfig.class);
        ConfigFromFile configFromFile = applicationContext.getBean(ConfigFromFile.class);

        LOGGER.info("Application Name : " + applicationConfig.getApplicationName());
        LOGGER.info("Application Version : " + multipleConfig.getApplicationVersion());
        LOGGER.info("Application Url : " + configFromFile.getApplicationUrl());
    }

}
