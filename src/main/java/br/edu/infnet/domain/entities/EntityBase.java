package br.edu.infnet.domain.entities;

import java.util.Objects;
import java.util.UUID;

public abstract class EntityBase {
    private UUID id;

//    public EntityBase(UUID id) {
//        this.id = UUID.randomUUID();
//    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EntityBase)) return false;
        EntityBase that = (EntityBase) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
