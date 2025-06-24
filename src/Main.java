import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Course;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("Java");
        course.setDescription("Um curso completo de Java.");
        course.setWorkload(10);

        Mentory mentory = new Mentory();
        mentory.setTitle("Mentoria de Java");
        mentory.setDescription("Uma mentoria de Java");
        mentory.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp de Java");
        bootcamp.setDescription("Um bootcamp completo de Java");
        bootcamp.getContents().add(course);
        bootcamp.getContents().add(mentory);

        Dev dev = new Dev();
        dev.setName("Charles");
        dev.registeredBootcamps(bootcamp);
        System.out.println("Conteúdos incritos: " + dev.getRegisteredContent());
        dev.progress();
        dev.progress();
        System.out.println("Conteúdos incritos: " + dev.getRegisteredContent());
        System.out.println("Conteúdos concluídos: " + dev.getCompletedContent());
        System.out.println("XP: " + dev.calcTotalXP());
    }
}