# currency-converter-microservice

### Ports

Application | Ports | Description
 --- | --- | ---
 `currency-exchange` | **8000,8001...8099** | Java based application
 `currency-conversion` | **8100,8101...8199** | Core of the microservices process
 `limits-service` | **10001** | Service used to trigger properties
  `eureka-naming-server` | **8765** | Used as a discovery client and load balancer
 `spring-cloud-config-server` | **8888** | Parse all configurations of the applications
  `zuul-api-gateway` | **8765** | Used for authorization/authentication for every microservices
 
### URLs
