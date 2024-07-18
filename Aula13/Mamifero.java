package Aula13;

public class Mamifero extends Animal {
    // Atributos
    protected String corPelo;

    // Métodos Sobrepostos
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }
}
