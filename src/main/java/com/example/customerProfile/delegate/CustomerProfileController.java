package com.example.customerProfile.delegate;

import com.example.customerProfile.model.Address;
import com.example.customerProfile.model.Customer;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerProfileController {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackConsumerProfile")
    @GetMapping("/customer/{userName}")
    public ResponseEntity<Customer> serverConsumerProfile(@PathVariable String userName) {
        Address addressClient = restTemplate.getForObject("http://localhost:8082/address/"+userName, Address.class);
        return ResponseEntity.ok(new Customer(userName,"Anitesh Kumar", addressClient));
    }

    public ResponseEntity<Customer> fallbackConsumerProfile(@PathVariable String userName) {
        Address addressClient =  new Address(userName,"dummy","dummy","dummy","dummy");
        return ResponseEntity.ok(new Customer(userName,"Anitesh Kumar", addressClient));
    }
}
