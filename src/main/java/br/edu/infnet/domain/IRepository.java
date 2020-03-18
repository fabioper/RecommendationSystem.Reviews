package br.edu.infnet.domain;

import java.util.List;
import java.util.UUID;

public interface IRepository<T> {
    T add(T entity);

    List<T> getAll();

    T getBy(UUID id);

    T update(T entity);

    T remove(UUID id);
}
