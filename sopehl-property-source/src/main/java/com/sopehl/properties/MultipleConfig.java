package com.sopehl.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources({
        @PropertySource("classpath:config.properties"),
        @PropertySource(value = "classpath:missing.properties", ignoreResourceNotFound = true),
        @PropertySource("classpath:other.properties")
})
public class MultipleConfig {

    @Value("${app.version}")
    private String applicationVersion;

    public String getApplicationVersion() {
        return this.applicationVersion;
    }

}
