package br.com.alura.screematch.domain.movie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private Integer duration;
    private Integer release;
    private String genre;
    
    public Movie(DataMovieRegister data){
        this.title = data.title();
        this.duration = data.duration();
        this.release = data.release();
        this.genre = data.genre();
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    public Integer getRelease() {
        return release;
    }
    public void setRelease(Integer release) {
        this.release = release;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "Movie [title=" + title + ", duration=" + duration + ", release=" + release + ", genre=" + genre + "]";
    }

    public long getId() {
        return id;
    }
}
