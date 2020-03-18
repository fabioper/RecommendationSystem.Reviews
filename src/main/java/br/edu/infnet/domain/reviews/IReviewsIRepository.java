package br.edu.infnet.domain.reviews;

import br.edu.infnet.domain.IRepository;

import java.util.List;

public interface IReviewsIRepository extends IRepository<Review> {
    List<Review> getByType(String subjectType);
}
