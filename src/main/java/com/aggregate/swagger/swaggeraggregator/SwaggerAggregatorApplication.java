package com.aggregate.swagger.swaggeraggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
public class SwaggerAggregatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerAggregatorApplication.class, args);
    }


}
