package com.curso.youtube.arquitectura.inputandoutputports.domain.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Customer {
    private String id;
    private String name;
    private String country;
}
