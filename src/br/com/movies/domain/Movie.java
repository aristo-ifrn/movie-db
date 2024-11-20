/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.movies.domain;

/**
 *
 * @author arist
 */
public class Movie {

    private int id, duration, release_year;
    private String title, age_rating, trailer_url, image_url;

    public Movie() {
    }

    public Movie(int duration, String title, int release_year, String age_rating, String trailer_url, String image_url) {
        this.duration = duration;
        this.title = title;
        this.release_year = release_year;
        this.age_rating = age_rating;
        this.trailer_url = trailer_url;
        this.image_url = image_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duracao) {
        this.duration = duracao;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titulo) {
        this.title = titulo;
    }

    public int getReleaseYear() {
        return release_year;
    }

    public void setReleaseYear(int ano_lancamento) {
        this.release_year = ano_lancamento;
    }

    public String getAgeRating() {
        return age_rating;
    }

    public void setAgeRating(String classificacao_etaria) {
        this.age_rating = classificacao_etaria;
    }

    public String getTrailerUrl() {
        return trailer_url;
    }

    public void setTrailerUrl(String trailer_url) {
        this.trailer_url = trailer_url;
    }

    public String getImageUrl() {
        return image_url;
    }

    public void setImageUrl(String image_url) {
        this.image_url = image_url;
    }

}
