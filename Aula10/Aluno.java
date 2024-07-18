package Aula10;

public class Aluno extends Pessoa {
    // Atributos
    private String matr;
    private String curso;

    // Métodos Públicos
    public void cancelarMatr(){
        this.matr = "Matricula Cancelada!";
    }

    // Métodos Gets&Sets
    public String getMatr() {
        return matr;
    }
    public void setMatr(String matr) {
        this.matr = matr;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
