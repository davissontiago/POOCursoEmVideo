package Aula11;

public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private double salario;

    // Métodos Públicos
    public void receberAum(double valor){
        this.salario += valor;
    }

    // Métodos Gets&Sets
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
