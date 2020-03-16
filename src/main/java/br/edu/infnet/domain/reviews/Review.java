package br.edu.infnet.domain.reviews;

import br.edu.infnet.domain.EntityBase;

import java.util.UUID;

public class Review extends EntityBase {
    private String title;
    private UUID subjectId;
    private String content;
    private double rate;
    private String subjectType;
}
