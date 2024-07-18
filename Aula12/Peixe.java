package Aula12;

public class Peixe extends Animal {
    // Atributos
    private String corEscama;

    // Métodos Públicos
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    // Métodos Sobrespostos
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Substâncias");
    }
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }
    
    // Métodos Gets&Sets
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
