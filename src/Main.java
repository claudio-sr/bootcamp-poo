import br.com.claudio.desafio.dominio.Bootcamp;
import br.com.claudio.desafio.dominio.Curso;
import br.com.claudio.desafio.dominio.Dev;
import br.com.claudio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        Mentoria mentoria = new Mentoria();

        curso1.setTitle("Java basic");
        curso1.setDescription("Curso basico de Java");
        curso1.setCargaHoraria(88);

        mentoria.setTitle("Java POO");
        mentoria.setDescription("Tudo de POO");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("POO");
        bootcamp.setDescricao("POO com Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devJohn = new Dev();
        devJohn.setNome("John");
        devJohn.inscreverBootcamp(bootcamp);
        System.out.println("Coteúdos matriculados" + devJohn.getConteudosInscritos());
        devJohn.progredir();
        System.out.println("Coteúdos concluidos" + devJohn.getConteudosConcluidos());
        System.out.println("XP:" + devJohn.calcularTotalXp());

        Dev devAnna = new Dev();
        devAnna.setNome("Anna");
        devAnna.inscreverBootcamp(bootcamp);
        System.out.println("Coteúdos matriculados" + devAnna.getConteudosInscritos());
        devAnna.progredir();
        System.out.println("Coteúdos concluidos" + devAnna.getConteudosConcluidos());
        System.out.println("XP:" + devAnna.calcularTotalXp());



    }
}