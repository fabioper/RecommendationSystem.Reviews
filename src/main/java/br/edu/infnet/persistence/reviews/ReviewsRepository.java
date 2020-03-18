package br.edu.infnet.persistence.reviews;

import br.edu.infnet.domain.reviews.IReviewsIRepository;
import br.edu.infnet.domain.reviews.Review;

import java.util.List;
import java.util.UUID;

public class ReviewsRepository implements IReviewsIRepository {

    @Override
    public Review add(Review review) {
        return null;
    }

    @Override
    public List<Review> getAll() {
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

    @Override
    public List<Review> getByType(String subjectType) {
        return null;
    }
}
