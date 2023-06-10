package com.curso.youtube.arquitectura.inputandoutputports.application.usercase;

import com.curso.youtube.arquitectura.inputandoutputports.domain.entity.Customer;
import com.curso.youtube.arquitectura.inputandoutputports.infrastructure.port.input.CustomerInputPort;
import com.curso.youtube.arquitectura.inputandoutputports.infrastructure.port.output.EntityRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class CustomerUserCase implements CustomerInputPort {

    final EntityRepository entityRepository;

    public CustomerUserCase(EntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    @Override
    public Customer createCustomer(String name, String country) {
        Customer customer = Customer.builder()
                .id(UUID.randomUUID().toString())
                .name(name)
                .country(country)
                .build();

        return entityRepository.save(customer);
    }

    @Override
    public Customer getCustomer(String id) {
        return entityRepository.findById(id, Customer.class);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return entityRepository.findAll(Customer.class);
    }
}
