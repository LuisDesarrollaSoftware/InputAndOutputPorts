package com.curso.youtube.arquitectura.inputandoutputports.infrastructure.adapter.input;


import com.curso.youtube.arquitectura.inputandoutputports.domain.entity.Customer;
import com.curso.youtube.arquitectura.inputandoutputports.infrastructure.port.input.CustomerInputPort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerAPI {

    final CustomerInputPort customerInputPort;

    public CustomerAPI(CustomerInputPort customerInputPort) {
        this.customerInputPort = customerInputPort;
    }

    @PostMapping("/{customer}/{country}")
    public Customer createCustomer(@PathVariable String customer, @PathVariable String country){
        return customerInputPort.createCustomer(customer, country);
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable String id){
        return customerInputPort.getCustomer(id);
    }

    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerInputPort.getAllCustomer();
    }

}
