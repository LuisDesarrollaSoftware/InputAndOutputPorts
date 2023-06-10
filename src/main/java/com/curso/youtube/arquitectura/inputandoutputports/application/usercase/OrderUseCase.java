package com.curso.youtube.arquitectura.inputandoutputports.application.usercase;

import com.curso.youtube.arquitectura.inputandoutputports.domain.entity.Order;
import com.curso.youtube.arquitectura.inputandoutputports.infrastructure.port.input.OrderInputPort;
import com.curso.youtube.arquitectura.inputandoutputports.infrastructure.port.output.EntityRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class OrderUseCase implements OrderInputPort {

    final EntityRepository entityRepository;

    public OrderUseCase(EntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    @Override
    public Order createOrder(String customerId, BigDecimal amount) {
        Order order = Order.builder()
                .id(UUID.randomUUID().toString())
                .customerId(customerId)
                .amount(amount)
                .build();

        return entityRepository.save(order);

    }
}
