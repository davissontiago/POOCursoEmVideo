package Aula12;

public class Ave extends Animal {
    // Atributos
    private String corPena;

    // Métodos Públicos
    public void fazerNinho(){
        System.out.println("Construiu um ninho");   
    }

    // Métodos Sobrespostos
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo sementes");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }

    // Métodos Gets&Sets
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
