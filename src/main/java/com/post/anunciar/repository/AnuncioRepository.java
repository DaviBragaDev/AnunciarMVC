package com.post.anunciar.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.post.anunciar.model.Anunciar;
@Repository

public interface AnuncioRepository extends JpaRepository<Anunciar, String> {
  }

   

