package org.acme.Models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Movie extends PanacheEntity {

    @Column(length = 100)
    private String title;
    @Column(length = 200)
    private String description;
    @Column
    private String director;
    @Column
    private String country;

    //Comportamentos: get list of movies, get movie by id; get movie by country; create a movie; update movie; delete movie;
    public List<Movie> getList() {
        return Movie.listAll();
    }
    //public Movie getMovieById(Long id) {
    //    return Movie.findByIdOptional(id)}

    //GETTERS AND SETTERS
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
