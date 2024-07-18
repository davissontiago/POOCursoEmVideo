package Aula13;

public class Cachorro extends Lobo {
    // Métodos Sobrepostos
    @Override
    public void emitirSom(){
        System.out.println("Au! Au!");
    }

    // Métodos Públicos
    public void reagir(String fala){
        if (fala.equals("Toma comida") || fala.equals("Olá")) {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora){
        if (hora >= 6 && hora < 13) {
            System.out.println("Abanar");
        } else if (hora >= 13 && hora <= 22) {
            System.out.println("Abanar e Latir");
        } else if (hora > 22 && hora <= 23) {
            System.out.println("Ignorar");
        } else if (hora >= 0 && hora <= 5) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Ignorar");
        }
    }

    public void reagir(boolean dono){
        if (dono == true) {
            System.out.println("Abana");
        } else {
            System.out.println("Ronas e Latir");
        }
    }

    public void reagir(){
        if (this.idade <= 5 && this.peso <= 10) {
            System.out.println("Abanar");
        } else if (this.idade <= 5 && this.peso > 10) {
            System.out.println("Latir");
        } else if (this.idade > 5 && this.peso <= 10) {
            System.out.println("Rosnar");
        } else if (this.idade > 5 && this.peso > 10) {
            System.out.println("Ignorar");
        }
    }
}
