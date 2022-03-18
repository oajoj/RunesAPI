package com.projeto.oajojjj.services;

import com.projeto.oajojjj.models.dtos.RuneDTO;
import com.projeto.oajojjj.models.entities.Rune;
import com.projeto.oajojjj.repositories.RunesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RunesService {

    private RunesRepository repository;

    public RunesService(RunesRepository repository){
        this.repository = repository;
    }

    public List<RuneDTO> getAllRunes() {
        return repository.findAll()
                .stream()
                .map(RuneDTO::new)
                .collect(Collectors.toList());
    }

    public RuneDTO getRuneById(Long id) {
        return this.repository
                .findById(id)
                .map(RuneDTO::new)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Rune not found"));
    }

    public RuneDTO saveRune(RuneDTO rune) {
        Rune savedRune = this.repository.save(new Rune(rune));
        return new RuneDTO(savedRune);
    }
}
