package com.post.anunciar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.post.anunciar.model.Anunciar;
@Repository
public class AnuncioRepository {
    public interface AnunciarRepository extends JpaRepository<Anunciar, Integer> {
        List<Anunciar> findAnunciarByProduto (String produto);
  }

   
}
