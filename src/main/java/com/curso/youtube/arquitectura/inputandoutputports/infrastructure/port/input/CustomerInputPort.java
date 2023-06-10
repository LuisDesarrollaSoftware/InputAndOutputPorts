package com.curso.youtube.arquitectura.inputandoutputports.infrastructure.port.input;

import com.curso.youtube.arquitectura.inputandoutputports.domain.entity.Customer;

import java.util.List;

public interface CustomerInputPort {

    public Customer createCustomer(String name, String country);

    public Customer getCustomer(String id);

    public List<Customer> getAllCustomer();

}
