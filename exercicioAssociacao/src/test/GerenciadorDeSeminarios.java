package exercicio.de.associacao.exercicioAssociacao.test;

import exercicio.de.associacao.exercicioAssociacao.domain.Professor;
import exercicio.de.associacao.exercicioAssociacao.domain.Seminario;
import exercicio.de.associacao.exercicioAssociacao.domain.Estudantes;
import exercicio.de.associacao.exercicioAssociacao.domain.Local;

public class GerenciadorDeSeminarios {
    public static void main(String[] args) {

        Local local01 = new Local("E.E.E.F Paraiba ciep, Juca Batista, Porto Alegre");
        Local local02 = new Local("FADERGS - Galeria Luza, Centro de Porto Alegre");

        Estudantes aluno01 = new Estudantes("Vinicius",20);
        Estudantes aluno02 = new Estudantes("Roger",23);
        Estudantes aluno03 = new Estudantes("Alcemar",12);
        Estudantes aluno04 = new Estudantes("Thiago",33);

        Estudantes aluno05 = new Estudantes("Pedrao",14);
        Estudantes aluno06 = new Estudantes("Felipao",22);
        Estudantes aluno07 = new Estudantes("Neymar",20);
        Estudantes aluno08 = new Estudantes("Fallen",17);

        Professor prof01 = new Professor("Guanabara", "Programacao");

        Estudantes[] alunosParaSeminario = {aluno01, aluno02, aluno03, aluno04};
        Estudantes[] alunosParaSeminario02 = {aluno05, aluno06, aluno07, aluno08};

        Seminario seminario01 = new Seminario("Seminario de Poo", local01, alunosParaSeminario);
        Seminario seminario02 = new Seminario("Seminario de Logica de programacao", local02, alunosParaSeminario02);

        Seminario[] seminariosDisponiveis = {seminario01, seminario02};

        prof01.setSeminarios(seminariosDisponiveis);

        prof01.imprime();

    }
}
