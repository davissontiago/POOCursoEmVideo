package Aula11;

public class Aluno extends Pessoa {
    // Atributos
    private int matricula;
    private String curso;
    public int getMatricula() {
        return matricula;
    }

    // Métodos públicos
    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade de aluno: " + this.nome);
    }

    // Métodos Gets&Sets
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}