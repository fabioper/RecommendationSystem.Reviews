package br.edu.infnet.persistence;

import br.edu.infnet.domain.entities.Review;
import br.edu.infnet.domain.interfaces.IReviewsIRepository;

import java.util.Collection;
import java.util.UUID;

public class ReviewsRepository implements IReviewsIRepository {

    @Override
    public Review add(Review review) {
        return null;
    }

    @Override
    public Collection<Review> getAll() {
        return null;
    }

    @Override
    public Review getBy(UUID id) {
        return null;
    }

    @Override
    public Review update(Review review) {
        return null;
    }

    @Override
    public Review remove(UUID id) {
        return null;
    }
}
