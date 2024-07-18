package Aula03;

public class Caneta {
    // Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Caneta do modelo: "+modelo+"\n"+
                            "da cor: "+cor+"\n"+
                            "com ponta: "+ponta+"\n"+
                            "carga em: "+carga+"\n"+
                            "está tampada? "+tampada);
    }

    public void rabiscar(){
        if (tampada == false && carga > 0) {
            System.out.println("Estou Rabiscando!");
        } else {
            System.out.println("Caneta Tampada ou Vazia!");
        }
    }

    public void tampar(){
        tampada = true;
    }

    public void destampar(){
        tampada = false;
    }
}
