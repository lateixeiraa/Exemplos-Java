public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; // INSTANCIA DA CLASSE PESSOA

    // Método público
    public void detalhes() {
        System.out.println("--- Detalhes sobre sua leitura ---");
        System.out.println("Leitor: " + leitor.getNome());
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + totPaginas);  
        System.out.println("Você esta na página: " + pagAtual); 
    }

    public Livro( String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    // Métodos especiais
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public boolean getAberto() {
        return aberto;
    }
    public String getAutor() {
        return autor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getTotPaginas() {
        return totPaginas;
    }

    // Métodos abstratos

    @Override
    public void abrir() {
       this.aberto = true;
       System.out.println("Livro aberto. Boa leitura");        
    }

    @Override
    public void fechar() {
        this.aberto = false;
        System.out.println("Livro fechado.");        
    }

    @Override
    public void folhear(int pagAtual) {
        // tem que estar aberto, se chegar ao final, fechar livro
        if(aberto == true){
            if(pagAtual > totPaginas){
                System.out.println("Você chegou ao fim do seu livro.");
            }
            else{
                this.pagAtual = pagAtual;
            }
        }      
        
    }

    @Override
    public void avançarPag() {
        if(aberto == true && pagAtual < totPaginas){
            this.pagAtual++;
        }
        else{
            System.out.println("Não é possivel avançar páginas.");
        }
    }

    @Override
    public void voltarPag() {
        if(aberto == true && pagAtual < totPaginas){
            this.pagAtual--;
        }
        else{
            System.out.println("Não é possivel avançar páginas.");
        }
    }
    
}
