package com.orange.mediastore.service;

import com.orange.mediastore.model.Movie;
import com.orange.mediastore.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MediaRepository mediaRepository;

    @Autowired
    public MovieService(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    public List<Movie> getMovieList() {
        return mediaRepository.findAll();
    }
}
