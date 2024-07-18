package Aula11;

public final class Bolsista extends Aluno {
    // Atributos
    private int bolsa;

    // Métodos públicos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é Bolsista, Pagamento Facilitado.");
    }

    // Métodos Gets&Sets
    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    
}
