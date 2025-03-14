package Aula14;

public class Gafanhoto extends Pessoa {
    // Atributos
    private String login;
    private int totAssistido;
    
    // Construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    // Métodos da Classe
    public void viuMaisUm(){
        this.totAssistido++;
    }

    // Métodos Gets&Sets
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    // toString
    @Override
    public String toString() {
        return "Gafanhoto [" + super.toString() + "\n"+ "[login=" + login + ", totAssistido=" + totAssistido + "]";
    }
    
    
}
