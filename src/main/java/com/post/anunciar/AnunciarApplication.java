package com.post.anunciar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.post.anunciar.model.Anunciar;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootApplication
public class AnunciarApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnunciarApplication.class, args);
	}


}
