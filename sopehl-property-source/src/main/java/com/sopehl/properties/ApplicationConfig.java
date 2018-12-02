package com.sopehl.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config.properties")
public class ApplicationConfig {

    @Value("${app.name}")
    private String applicationName;

    public String getApplicationName() {
        return this.applicationName;
    }
}
