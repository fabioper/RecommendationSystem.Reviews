package br.edu.infnet.domain.reviews;

import br.edu.infnet.domain.IRepository;

import java.util.Collection;

public interface IReviewsIRepository extends IRepository<Review> {
    Collection<Review> getByType(String subjectType);
}
