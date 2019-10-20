package com.orange.moviestore;

import com.orange.moviestore.model.Movie;
import com.orange.moviestore.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private MoviesRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Add data to the database just for demonstration
     */
    @Override
    public void run(String... args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Titanic");
        movie1.setYear("1997");
        movie1.setDirector("James Cameron");

        Movie movie2 = new Movie();
        movie2.setTitle("Matrix");
        movie2.setYear("1999");
        movie2.setDirector("Wachovski");

        repository.save(movie1);
        repository.save(movie2);
    }
}
