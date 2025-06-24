package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentory extends Content {
    private LocalDate date;

    @Override
    public double calcXP() {
        return DEFAULT_XP + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
