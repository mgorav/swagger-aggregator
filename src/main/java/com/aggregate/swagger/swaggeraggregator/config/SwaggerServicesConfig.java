package com.aggregate.swagger.swaggeraggregator.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "documentation.swagger")
public class SwaggerServicesConfig {

    List<SwaggerService> services;

    public List<SwaggerService> getServices() {
        return services;
    }

    public void setServices(List<SwaggerService> services) {
        this.services = services;
    }
}
