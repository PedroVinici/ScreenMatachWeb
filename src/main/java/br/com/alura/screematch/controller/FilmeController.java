package br.com.alura.screematch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.screematch.domain.movie.DataMovieRegister;
import br.com.alura.screematch.domain.movie.Movie;

@Controller
@RequestMapping("/movies")
public class FilmeController{
    private List<Movie> movies = new ArrayList<>(); 

    @GetMapping("/register")
    public String loadFormPage() {
        return "movies/form";
    }

    @GetMapping
    public String loadMovieListPage(Model model) {
        model.addAttribute("list", movies);
        return "movies/movieList";
    }

    @PostMapping
    public String movieRegister(DataMovieRegister data, Model model) {
        var movie = new Movie(data);
        movies.add(movie);

        System.out.println(movies);

        return "redirect:/movies";
    }
}