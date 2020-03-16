package br.edu.infnet.domain;

import java.util.Collection;
import java.util.UUID;

public interface IRepository<T> {
    T add(T entity);

    Collection<T> getAll();

    T getBy(UUID id);

    T update(T entity);

    T remove(UUID id);
}
