package com.post.anunciar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.post.anunciar.model.Anunciar;
import com.post.anunciar.repository.AnuncioRepository;


@Service
public class AnuncioService {
    private AnuncioRepository repository;

    public AnuncioService(AnuncioRepository repository) {
        this.repository = repository;
    }

      public void save (Anunciar a){
        a.produtoAnuncio();
        repository.save(a);
    }  

    public List<Anunciar> findAll(){
        return repository.findAll();
    }

}
