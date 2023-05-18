package com.post.anunciar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.post.anunciar.model.Anunciar;
import com.post.anunciar.repository.AnuncioRepository;


@Service
public class  AnuncioService {
    private AnuncioRepository repository;

    public AnuncioService(AnuncioRepository repository) {
        this.repository = repository;
    }

    public void save (Anunciar a){
        repository.save(a);
    }
    public Optional<Anunciar> findById(String id){
        return repository.findById(id);
    }

    public List<Anunciar> findAll(){
        return repository.findAll();
    }

}
