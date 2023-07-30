package br.com.alura.screematch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class FilmeController{

    @GetMapping
    public String loadFormuPage() {
        return "movies/form";
    }
}