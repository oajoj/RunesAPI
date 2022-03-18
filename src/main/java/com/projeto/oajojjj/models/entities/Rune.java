package com.projeto.oajojjj.models.entities;

import com.projeto.oajojjj.models.dtos.RuneDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rune {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Effect effect;
    private Location location;
    private String glyph;
    private String note;

    public Rune() {
    }

    public Rune(RuneDTO dto){
        this.id = dto.getId();
        this.name = dto.getName();
        this.effect = dto.getEffect();
        this.location = dto.getLocation();
        this.glyph = dto.getGlyph();
        this.note = dto.getNote();
    }

    public Rune(String name, Effect effect, Location location, String glyph, String note) {
        this.name = name;
        this.effect = effect;
        this.location = location;
        this.glyph = glyph;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGlyph() {
        return glyph;
    }

    public void setGlyph(String glyph) {
        this.glyph = glyph;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
