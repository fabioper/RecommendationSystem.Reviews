package br.edu.infnet.domain;

import java.util.Collection;
import java.util.UUID;

public interface IRepository<TEntity> {
    TEntity add(TEntity entity);

    Collection<TEntity> getAll();

    TEntity getBy(UUID id);

    TEntity update(TEntity entity);

    TEntity remove(UUID id);
}
