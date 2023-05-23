package com.post.anunciar.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Anunciar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    String id;
    String produto;
    String descricao;
    String valor;

}
