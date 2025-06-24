package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import static java.util.Objects.hash;
import static java.util.Objects.isNull;

public class Bootcamp {
    private String name;
    private String description;

    private final LocalDate inicialDate = LocalDate.now();
    private final LocalDate finalDate = inicialDate.plusDays(45);

    private Set<Dev> registeredDev = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInicialDate() {
        return inicialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getRegisteredDev() {
        return registeredDev;
    }

    public void setRegisteredDev(Set<Dev> registeredDev) {
        this.registeredDev = registeredDev;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(inicialDate, bootcamp.inicialDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(registeredDev, bootcamp.registeredDev) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return hash(name, description, inicialDate, finalDate, registeredDev, contents);
    }
}