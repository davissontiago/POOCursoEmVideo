package Aula11;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
        Professor p1 = new Professor();

        v1.setNome("Matheus");
        v1.setIdade(20);
        v1.setSexo("M");

        a1.setNome("Maria");
        a1.setIdade(22);
        a1.setSexo("F");
        a1.setCurso("Computação");
        a1.setMatricula(4312);

        b1.setNome("Davi");
        b1.setIdade(21);
        b1.setSexo("M");
        b1.setCurso("Matemática");
        b1.setMatricula(1643);
        b1.setBolsa(779);

        p1.setNome("José");
        p1.setIdade(34);
        p1.setSexo("M");
        p1.setSalario(1500.0);
        p1.setEspecialidade("Matemática");
        

        a1.pagarMensalidade();
        b1.renovarBolsa();
        b1.pagarMensalidade();

        p1.receberAum(500.0);
        
    }
}
