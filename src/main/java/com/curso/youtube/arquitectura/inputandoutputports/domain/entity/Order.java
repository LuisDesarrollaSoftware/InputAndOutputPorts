package com.curso.youtube.arquitectura.inputandoutputports.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Order {
    String id;
    String customerId;
    BigDecimal amount;
}
