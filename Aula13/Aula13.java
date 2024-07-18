package Aula13;

public class Aula13 {
    public static void main(String[] args) {
        Mamifero mama = new Mamifero();
        Lobo lobi = new Lobo();
        Cachorro chorro = new Cachorro();

        mama.emitirSom();
        lobi.emitirSom();
        chorro.emitirSom();
        System.out.println("------------------------------------------");

        chorro.reagir("Olá");
        chorro.reagir("Toma comida");
        chorro.reagir("Cachorro Feioo");
        System.out.println("------------------------------------------");

        chorro.reagir(3);
        chorro.reagir(8);
        chorro.reagir(15);
        System.out.println("------------------------------------------");

        chorro.reagir(false);
        chorro.reagir(true);
        System.out.println("------------------------------------------");

        chorro.setIdade(3);
        chorro.setPeso(8);
        System.out.println("Novo e Leve");
        chorro.reagir();
        System.out.println("------------------------------------------");
        chorro.setIdade(3);
        chorro.setPeso(14);
        System.out.println("Novo e Pesado");
        chorro.reagir();
        System.out.println("------------------------------------------");
        chorro.setIdade(7);
        chorro.setPeso(8);
        System.out.println("Velho e Leve");
        chorro.reagir();
        System.out.println("------------------------------------------");
        chorro.setIdade(7);
        chorro.setPeso(14);
        System.out.println("Velho e Pesado");
        chorro.reagir();

        

    }
}
