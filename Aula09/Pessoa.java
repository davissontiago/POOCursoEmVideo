package Aula09;

public class Pessoa {
    // Atributos
    private String nome, sexo;
    private int idade;

    // Métodos Especiais
    public void fazerAniver(){
        setIdade(idade + 1);
    }  

    // Método Construtor
    public Pessoa(String nome, String sexo, int idade){
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
    }
    // Métodos Gets e Sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
