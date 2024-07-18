package Aula12;

public class Canguru extends Mamifero{
    // Métodos Públicos
    public void usarBolsa(){
        System.out.println("Usando Bolsa");
    }

    // Métodos Sobrespostos
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
