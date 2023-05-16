package com.post.anunciar.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Anunciar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    String produto;
    String descricao;
    String valor;
    public void produtoAnuncio(){
        this.produto.toUpperCase();
    }
}
