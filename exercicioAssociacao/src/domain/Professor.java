package exercicio.de.associacao.exercicioAssociacao.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("-------- RELATORIO DO PROFESSOR ----------");
        System.out.println("Professor responsavel: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("------------------------------------------------------------");
        if (this.seminarios == null) return;
        System.out.println(" ------ SEMINARIOS CADASTRADOS ------");

        for (Seminario seminario : this.seminarios) {
            System.out.println("------------------------------------------------------------");
            System.out.println("Titulo: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            System.out.println("------------------------------------------------------------");

            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) break;
            System.out.println("==> Lista de Alunos: ");
            for (Estudantes aluno : seminario.getAlunos()) {
                System.out.println("Nome: " + aluno.getNome() + " - Idade: " + aluno.getIdade());
            }

        }

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
