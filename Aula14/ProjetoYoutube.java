package Aula14;

public class ProjetoYoutube {
    public static void main(String[] args) {
        // Objeto Video
        Video v[] = new Video[3];
        v[0] = new Video("Aula01");
        v[1] = new Video("Aula02");
        v[2] = new Video("Aula03"); 

        System.out.println("\n"+"*** Vídeos ***"+"\n");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].toString());
        }

        // Objeto Gafanhoto
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Dávisson", 19, "M", "davissontiago");
        g[1] = new Gafanhoto("Anna", 18, "F", "annaclara");

        System.out.println("\n"+"*** Gafanhotos ***"+"\n");
        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i].toString());
        }

        // Objteto Visualização

        Visualizacao visu1 = new Visualizacao(g[0], v[0]);
        visu1.avaliar();
        Visualizacao visu2 = new Visualizacao(g[0], v[1]);
        visu2.avaliar(8);
        Visualizacao visu3 = new Visualizacao(g[1], v[0]);
        visu3.avaliar(0);

        System.out.println("\n"+"*** Visualizações ***"+"\n");
        System.out.println(visu1.toString());

        System.out.println("\n"+"*** Gafanhotos ***"+"\n");
        for (int i = 0; i < g.length; i++) {
            System.out.println(g[i].toString());
        }

        System.out.println("\n"+"*** Vídeos ***"+"\n");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i].toString());
        }
    }
}
