package com.sopehl.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Getting properties from external files not classpath and using with ${} notation.
 */
@Component
@PropertySource("file:${test.config.path}/test.properties")
public class ConfigFromFile {

    @Value("${app.url}")
    private String applicationUrl;

    public String getApplicationUrl() {
        return this.applicationUrl;
    }

}
