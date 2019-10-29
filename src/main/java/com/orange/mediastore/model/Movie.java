package com.orange.mediastore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Set;

@Document(collection = "media")
public class Movie {

    @Id
    public String id;
    public String title;
    public String director;
    public LocalDate release;
    public Set<String> actors;
    public Double averageRating;
    public Duration runtime;
}
