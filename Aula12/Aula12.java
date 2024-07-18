package Aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru cangu = new Canguru();
        Cachorro chorro = new Cachorro();
        Cobra cobra = new Cobra();
        PeixeBeta beta = new PeixeBeta();
        JoaoDeBarro jbarro = new JoaoDeBarro();

        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("---------------------------");
        r.locomover();
        r.alimentar();
        r.emitirSom();
        System.out.println("---------------------------");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        System.out.println("---------------------------");
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println("---------------------------");
        cangu.locomover();
        cangu.alimentar();
        cangu.emitirSom();
        cangu.usarBolsa();
        System.out.println("---------------------------");
        chorro.locomover();
        chorro.alimentar();
        chorro.emitirSom();
        System.out.println("---------------------------");
        cobra.locomover();
        cobra.alimentar();
        cobra.emitirSom();
        System.out.println("---------------------------");
        beta.locomover();
        beta.alimentar();
        beta.emitirSom();
        beta.soltarBolha();
        System.out.println("---------------------------");
        jbarro.locomover();
        jbarro.alimentar();
        jbarro.emitirSom();
        jbarro.fazerNinho();

    }
}
