package com.amigoscode.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
public record CustomerController(CustomerService customerService) {
  @PostMapping
    public ResponseEntity registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest){
        log.info("new customer registration{}",customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
        return ResponseEntity.ok(customerRegistrationRequest);
    }
}
