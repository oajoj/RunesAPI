package com.projeto.oajojjj.controllers;

import com.projeto.oajojjj.models.dtos.RuneDTO;
import com.projeto.oajojjj.services.RunesService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Controller
@RequestMapping("/runes")
public class RunesController {

    private RunesService service;

    public RunesController(RunesService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<RuneDTO>> getAllRunes(){
        List<RuneDTO> runes = this.service.getAllRunes();
        return ResponseEntity.ok(runes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RuneDTO> getRuneById(@PathVariable Long id){
        RuneDTO dto = this.service.getRuneById(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<RuneDTO> saveRune(@RequestBody RuneDTO runeDTO){
        RuneDTO savedRuneDTO = this.service.saveRune(runeDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedRuneDTO).toUri();
        return ResponseEntity.created(uri).body(savedRuneDTO);
    }

}
