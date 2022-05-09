// Encapsulamento

public class Leitura {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] leitura = new Livro[2];

        p[0] = new Pessoa("Larissa", 25, "Feminino");
        
        
        leitura[0] = new Livro("Nome do Vento", "Patrick",300, p[0]);
        
        leitura[0].abrir();
        leitura[0].folhear(5000);
        leitura[0].voltarPag();
        leitura[0].detalhes();
    }
}
