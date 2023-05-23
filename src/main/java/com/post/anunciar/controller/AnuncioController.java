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
        model.addAttribute("anunciarList", AnunciarList);
        return "index.html";
    }
    @GetMapping("/cadastroProduto")
    public String getCadastrarPage(Model model){
        Anunciar a = new Anunciar();
        model.addAttribute("anunciar", a);
        return "cadastroProduto";
    }
    @PostMapping("/doSalvar")
    public String doSalvar(@ModelAttribute Anunciar a){
        service.save(a);
        return "redirect:/index";
    }
    @GetMapping("/editarPage/{id}")
    public String getEditarPage(@PathVariable(name = "id") String id, Model model){
        Optional<Anunciar> A = service.findById(id);
        if (A.isPresent()){
            model.addAttribute("anunciar", A.get());
        }else{
            return "redirect:/index";
        }

        return "editarPage";
    }

    @GetMapping("/deletarPage/{id}")
    public String getDeletarPage(@PathVariable(name = "id") String id, Model model){
    Optional<Anunciar> a = service.findById(id);
    if (a.isPresent()) {
        service.delete(id);
    }
    return "redirect:/index";
    }
    

}


