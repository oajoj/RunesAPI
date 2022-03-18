package com.projeto.oajojjj;

import com.projeto.oajojjj.models.entities.Rune;
import com.projeto.oajojjj.repositories.RunesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OajojjjApplication implements CommandLineRunner {

	@Autowired
	private RunesRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(OajojjjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Rune rune = new Rune("rune", "effect", "location", "glyph", "note");
		repository.save(rune);
	}
}
