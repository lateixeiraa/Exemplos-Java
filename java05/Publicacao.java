// Interface do projeto

public interface Publicacao {
    
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pagAtual);
    public abstract void avançarPag();
    public abstract void voltarPag();
    
}
