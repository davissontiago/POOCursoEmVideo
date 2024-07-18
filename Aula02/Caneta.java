package Aula02;

public class Caneta {
    // Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Caneta do modelo: "+modelo+"\n"+
                            "da cor: "+cor+"\n"+
                            "com ponta: "+ponta+"\n"+
                            "carga em: "+carga+"\n"+
                            "está tampada? "+tampada);
    }

    void rabiscar(){
        if (tampada == false && carga > 0) {
            System.out.println("Estou Rabiscando!");
        } else {
            System.out.println("Caneta Tampada ou Vazia!");
        }
    }

    void tampar(){
        tampada = true;
    }

    void destampar(){
        tampada = false;
    }
}
