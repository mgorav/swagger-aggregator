# Swagger Aggregator

  A simple, Spring BOOT applicaiton which aggregates/consolidates all the swagger definitions.
  This app if added to Spring BOOT based Netflix Zuul (API Gateway) will provide complete API gateway features like 
  paid product [Swagger Hub](https://swaggerhub.com)
  
  NOTE: Possible extension(s)
  1. PropertyResourceProvider can be easily extended to all the micro services based swagger definition
     from service registry like [consul](https://www.consul.io).This can be simply achieved by adding Spring Cloud 
     (consul) to pom.xml using DiscoveryClient. Alternatively, one can load Swagger definition from DB also.
  2. Currently Swagger Aggregator consolidates all swagger definition defined in application.yml
  3. Swagger Aggregator application.yml is defined out side the application in the config folder. This provides ease in 
     changing the application properties without building application again