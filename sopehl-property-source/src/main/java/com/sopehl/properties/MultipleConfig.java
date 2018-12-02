package com.sopehl.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
//Got more details from https://www.mkyong.com/spring/spring-propertysources-example/
@Component
@PropertySources({
        @PropertySource("classpath:config.properties"),
        @PropertySource(value = "classpath:missing.properties", ignoreResourceNotFound = true),
        @PropertySource("classpath:other.properties")//if same key, this will 'win'
})
public class MultipleConfig {

    @Value("${app.version}")
    private String applicationVersion;

    public String getApplicationVersion() {
        return this.applicationVersion;
    }

}
