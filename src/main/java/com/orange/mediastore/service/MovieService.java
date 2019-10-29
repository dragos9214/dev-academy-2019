package com.orange.mediastore.service;

import com.orange.mediastore.model.Movie;
import com.orange.mediastore.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MoviesRepository moviesRepository;

    @Autowired
    public MovieService(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    public List<Movie> getMovieList() {
        return moviesRepository.findAll();
    }
}
