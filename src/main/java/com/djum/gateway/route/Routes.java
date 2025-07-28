package com.djum.gateway.route;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

public class Routes {

     @Bean
     public RouteLocator routeLocator(RouteLocatorBuilder builder) {
         return builder.routes()
                 .route("airline", r -> r.path("/airline/**")
                         .uri("http://localhost:8082"))
                 .route("actor", r -> r.path("/actor/**")
                         .uri("http://localhost:8083"))
                 .build();
     }

}
