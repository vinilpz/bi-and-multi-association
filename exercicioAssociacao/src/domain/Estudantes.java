package exercicio.de.associacao.exercicioAssociacao.domain;

public class Estudantes {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudantes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Estudantes(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.seminario = seminario;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println(this.getNome() + "-" + this.getIdade() + "-" + this.getSeminario());
    }

}