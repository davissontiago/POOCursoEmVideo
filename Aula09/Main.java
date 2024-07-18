package Aula09;

public class Main {
    public static void main(String[] args) {
        // Pessoa
        Pessoa p1 = new Pessoa("Dávisson Tiago","masculino", 19);
 
        System.out.println(p1.getNome() + "\n" + p1.getSexo() + "\n" + p1.getIdade() + "\n----------");
        p1.fazerAniver();
        System.out.println(p1.getNome() + "\n" + p1.getSexo() + "\n" + p1.getIdade() + "\n----------");

        // Livro
        Livro l1 = new Livro("Percy Jackson e O ladrão de raios", 
        "Rick Riordan", 380, p1);

        l1.detalhes();
        l1.avancarPag();
        l1.abrir();
        l1.voltarPag();
        l1.avancarPag();
        l1.voltarPag();
        l1.folhear(379);
        l1.avancarPag();
        l1.avancarPag();
        l1.folhear(0);
        l1.folhear(400);
        l1.folhear(150);
        l1.fechar();
        l1.folhear(0);
        l1.folhear(504);
        l1.voltarPag();
        l1.avancarPag();
        l1.abrir();

    }
}
