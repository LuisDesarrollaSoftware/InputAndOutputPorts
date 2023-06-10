package com.curso.youtube.arquitectura.inputandoutputports.infrastructure.port.output;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface EntityRepository {

    public <T> T save(T entity);

    public <T> T findById(String id, Class<T> entityClass);

    public <T> List<T> findAll(Class<T> entityClass);
}
