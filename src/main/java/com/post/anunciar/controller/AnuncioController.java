package com.post.anunciar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.post.anunciar.model.Anunciar;
import com.post.anunciar.service.AnuncioService;

import java.util.List;
import java.util.Optional;

@Controller
public class AnuncioController {
    AnuncioService service;

    public AnuncioController(AnuncioService service) {
        this.service = service;
    }
    @GetMapping({"/", "/index", "/index.html"})
    public String getIndex(Model model){
        List<Anunciar> AnunciarList = service.findAll();
        model.addAttribute("AnunciarList", AnunciarList);
        return "index.html";
    }
    @GetMapping("/cadastroProduto")
    public String getCadastrarPage(Model model){
        Anunciar a = new Anunciar();
        model.addAttribute("postagem", a);
        return "cadastroProduto";
    }
    @PostMapping("/doSalvar")
    public String doSalvar(@ModelAttribute Anunciar a){
        service.save(a);
        return "redirect:/index";
    }
    @GetMapping("/editarPage/{id}")
    public String getEditarPage(@PathVariable(name = "id") Integer id, Model model){
        Optional<Anunciar> A = service.findById(id);
        if (A.isPresent()){
            model.addAttribute("Anunciar", A.get());
        }else{
            return "redirect:/index";
        }

        return "editarPage";
    }

}


