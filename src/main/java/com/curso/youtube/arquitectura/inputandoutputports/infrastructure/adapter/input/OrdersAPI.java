package com.curso.youtube.arquitectura.inputandoutputports.infrastructure.adapter.input;

import com.curso.youtube.arquitectura.inputandoutputports.infrastructure.port.input.OrderInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersAPI {

    final OrderInputPort orderInputPort;

    public OrdersAPI(OrderInputPort orderInputPort) {
        this.orderInputPort = orderInputPort;
    }

    @PostMapping("/{customer}/{order}")
    public void createOrder(@PathVariable String customer, @PathVariable BigDecimal order){
        orderInputPort.createOrder(customer, order);
    }
}
