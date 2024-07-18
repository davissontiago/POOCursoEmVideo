package Aula09;

public class Livro implements Publicacao{
    // Atributos
    private String titulo, author;
    private int totalPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos Especiais
    public void detalhes(){
        System.out.println("O livro "+getTitulo()+" foi escrito por "+getAuthor()+", tem "+getTotalPag()+" páginas");
        if (this.aberto == true) {
            System.out.println("O livro se encontra aberto na pág "+getPagAtual());
        }else {
            System.out.println("O livro se encontra fechado");
        }
        System.out.println("-----------------------------------------");
    }

    public void estado(){
        if (this.aberto == true) {
            System.out.println("O livro se encontra aberto na pág "+getPagAtual());
        }else {
            System.out.println("O livro se encontra fechado");
        }
        System.out.println("-----------------------------------------");
    }

    // Métodos Construtor
    public Livro(String titulo, String author, int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.author = author;
        this.totalPag = totalPag;
        this.pagAtual = 1;
        this.leitor = leitor;
        this.aberto = false;
    }

    // Métodos Gets e Sets
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getTotalPag() {
        return totalPag;
    }
    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Métodos Abstratos
    @Override
    public void abrir() {
        setAberto(true);
        System.out.println("Livro Aberto na pág "+getPagAtual()+ "\n------------------------------------------");
    }

    @Override
    public void avancarPag() {
        if (this.aberto == true && pagAtual < this.totalPag) {
            setPagAtual(this.pagAtual + 1);
            System.out.println(">>>");
            estado();
        } else if (this.aberto == false) {
            System.out.println("Impossével avançar, livro Fechado \n-----------------------------------------");
        } else {
            System.out.println("Impossível avançar mais páginas \n-----------------------------------------");
            estado();
        }
    }

    @Override
    public void fechar() {
        setAberto(false);
        System.out.println("Livro Fechado \n-----------------------------------------");
    }

    @Override
    public void folhear(int pag) {
        if (this.aberto) {
            if (pag > 0 && pag <= totalPag) {
                if (pag > pagAtual) {
                    System.out.println(">>>>>>>>>");
                    setPagAtual(pag);
                } else {
                    System.out.println("<<<<<<<<<<");
                    setPagAtual(pag);
                }
                estado();
            } else if (pag <= 0) {
                setPagAtual(1);
                estado();
            } else {
                setPagAtual(totalPag);
                estado();
            }
        } else {
            System.out.println("Impossível folhear livro Fechado \n-----------------------------------------");
        }
    }
    
    
    @Override
    public void voltarPag() {
        if (this.aberto == true && this.pagAtual >= 2) {
            setPagAtual(this.pagAtual - 1);
            System.out.println("<<<");
            estado();
        }  else if (this.aberto == false) {
            System.out.println("Impossével voltar livro Fechado \n-----------------------------------------");
        } else {
            System.out.println("Impossível voltar mais páginas \n-----------------------------------------");
            estado();
        }
    }
}
