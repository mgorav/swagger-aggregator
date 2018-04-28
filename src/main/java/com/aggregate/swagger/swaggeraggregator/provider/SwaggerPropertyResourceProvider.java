package com.aggregate.swagger.swaggeraggregator.provider;

import com.aggregate.swagger.swaggeraggregator.config.SwaggerServicesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.EMPTY_LIST;
import static java.util.stream.Collectors.toList;

@Controller
@Primary
public class SwaggerPropertyResourceProvider implements SwaggerResourcesProvider {
    @Autowired
    private SwaggerServicesConfig config;

    @Override
    public List<SwaggerResource> get() {
        return config.getServices() != null ? config.getServices().stream().map(svc -> {
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(svc.getName());
            swaggerResource.setLocation(svc.getUrl());
            swaggerResource.setSwaggerVersion(svc.getVersion());
            return swaggerResource;
        }).collect(toList()) : EMPTY_LIST;

    }
}
