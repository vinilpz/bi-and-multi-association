package exercicio.de.associacao.exercicioAssociacao.domain;

public class Seminario {
    private String titulo;
    private Local local;
    private Estudantes[] alunos;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Estudantes[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, Local local, Estudantes[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Estudantes[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Estudantes[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
