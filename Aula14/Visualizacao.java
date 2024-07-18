package Aula14;

public class Visualizacao {
    // Atributos
    private Gafanhoto espectador;
    private Video filme;

    // Construtor
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    // Métodos
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }

    public void avaliar(float nota){
        this.filme.setAvaliacao(nota);
    }

    // Gets&Sets
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    // toString
    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }


    


}
