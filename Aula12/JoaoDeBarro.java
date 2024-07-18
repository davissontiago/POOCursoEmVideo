package Aula12;

public class JoaoDeBarro extends Ave {
    // Métodos Sobrespostos
    @Override
    public void fazerNinho(){
        System.out.println("Construiu casa de Barro");   
    }
    @Override
    public void emitirSom(){
        System.out.println("Cantando");
    }
}
