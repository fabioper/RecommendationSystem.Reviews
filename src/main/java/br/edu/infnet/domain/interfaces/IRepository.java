package br.edu.infnet.domain.interfaces;

import br.edu.infnet.domain.entities.EntityBase;

import java.util.Collection;
import java.util.UUID;

public interface IRepository<TEntity extends EntityBase> {
    TEntity add(TEntity entity);

    Collection<TEntity> getAll();

    TEntity getById(UUID id);

    TEntity update(TEntity entity);

    TEntity remove(UUID id);
}
