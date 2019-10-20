package com.orange.moviestore.repository;

import com.orange.moviestore.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends MongoRepository<Movie, String> {
}
