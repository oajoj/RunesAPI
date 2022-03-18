package com.projeto.oajojjj.models.entities;

import javax.persistence.Entity;

@Entity
public class Effect {
    private Long id;
    private String name;
    private Float bonusValue;

    public Effect() {
    }

    public Effect(Long id, String name, Float bonusValue) {
        this.id = id;
        this.name = name;
        this.bonusValue = bonusValue;
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

    public Float getBonusValue() {
        return bonusValue;
    }

    public void setBonusValue(Float bonusValue) {
        this.bonusValue = bonusValue;
    }
}
