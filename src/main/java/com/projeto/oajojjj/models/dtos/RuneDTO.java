package com.projeto.oajojjj.models.dtos;

import com.projeto.oajojjj.models.entities.Rune;

public class RuneDTO {
    private Long id;
    private String name;
    private String effect;
    private String location;
    private String glyph;
    private String note;

    public RuneDTO() {
    }

    public RuneDTO(Rune rune){
        this.id = rune.getId();
        this.name = rune.getName();
        this.effect = rune.getEffect();
        this.location = rune.getLocation();
        this.glyph = rune.getGlyph();
        this.note = rune. getNote();
    }

    public RuneDTO(String name, String effect, String location, String glyph, String note) {
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
