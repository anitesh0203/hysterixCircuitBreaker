# hysterixCircuitBreaker

We are implmenting the circuit breaker architecture here.

the external address service should be running in order to serve the GET customer/{userName} request
In case it does not we send the dummy values in the response.

Ideally the the central service should always call the proxy services individually and not at a central place.

annotate the method 
    @HystrixCommand(fallbackMethod = "fallbackConsumerProfile")
and the application as 
@SpringBootApplication
@EnableHystrix
@ComponentScan(basePackages = "com.example")
public class CustomerProfileApplication {
