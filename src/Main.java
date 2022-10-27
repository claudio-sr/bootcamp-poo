import br.com.claudio.desafio.dominio.Curso;
import br.com.claudio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Java basic");
        curso1.setDescricao("Curso basico de Java");
        curso1.setCargaHoraria(88);

        mentoria.setTitulo("Java POO");
        mentoria.setDescricao("Tudo de POO");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);
    }
}