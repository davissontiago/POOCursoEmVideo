package Aula12;

public class Reptil extends Animal {
    // Atributos
    private String corEscama;

    // Métodos Sobrespostos
    @Override
    public void locomover(){
        System.out.println("Rasteijando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo Vegetais");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Réptil");
    }

    // Métodos Gets&Sets
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
