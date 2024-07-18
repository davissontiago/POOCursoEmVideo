package Aula10;

public class Aula10 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Funcionario f1 = new Funcionario();

        a1.setNome("Joãozinho");
        a1.setIdade(14);
        a1.setSexo("M");

        p1.setNome("Maria");
        p1.setIdade(35);
        p1.setSexo("F");

        f1.setNome("Antônio");
        f1.setIdade(47);
        f1.setSexo("M");

        a1.setCurso("Matemática");
        a1.setMatr("MAT3002");
        a1.cancelarMatr();

        p1.setEspecialidade("Matemática");
        p1.setSalario(4000.0);
        p1.receberAum(1000.0);

        f1.setSetor("Portaria");
        f1.setTrabalhando(true);
        f1.fazerAniver();
        f1.mudarTrabalhando();
    
    }
}
