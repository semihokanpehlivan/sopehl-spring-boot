package com.sopehl.properties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * If you don't use the ignoreResourceNotFound = true, application will throw
 * "Caused by: java.io.FileNotFoundException: class path resource [missing.properties] cannot be opened because it does not exist"
 * exception.
 */
@Component
@PropertySource(value = "classpath:missing.properties", ignoreResourceNotFound = true)
public class MissingConfig {

}
