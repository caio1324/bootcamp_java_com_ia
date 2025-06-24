package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import static java.util.Objects.hash;
import static java.util.Objects.isNull;

public class Dev {
    private String name;
    private Set<Content> registeredContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public void registeredBootcamps(Bootcamp bootcamp) {
        this.registeredContent.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDev().add(this);
    }

    public void progress(){
        Optional<Content> content = this.registeredContent.stream().findFirst();
        if (content.isPresent()) {
            this.completedContent.add(content.get());
            this.registeredContent.remove(content.get());
        } else {
            System.err.println("Você não está escrito em nenhum conteúdo");
        }
    }

    public double calcTotalXP() {
        return this.completedContent.stream().mapToDouble(Content::calcXP).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getRegisteredContent() {
        return registeredContent;
    }

    public void setRegisteredContent(Set<Content> registeredContent) {
        this.registeredContent = registeredContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    public void setCompletedContent(Set<Content> completedContent) {
        this.completedContent = completedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if ((isNull(o)) || !(o instanceof Dev dev)) return false;
        return Objects.equals(this.name, dev.getName()) &&
                Objects.equals(this.registeredContent, dev.getRegisteredContent()) &&
                Objects.equals(this.completedContent, dev.getCompletedContent());
    }

    @Override
    public int hashCode() {
        return hash(name, registeredContent, completedContent);
    }
}
