package com.curso.youtube.arquitectura.inputandoutputports.infrastructure.port.input;

import com.curso.youtube.arquitectura.inputandoutputports.domain.entity.Order;

import java.math.BigDecimal;

public interface OrderInputPort {
        public Order createOrder(String customerId, BigDecimal orderId);
}
