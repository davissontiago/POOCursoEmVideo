package Aula04;

public class Caneta {
    // Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    
}
