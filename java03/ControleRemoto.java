public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos Especiais

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);   
        System.out.println("Ligando... Seja bem-vindo!");     
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando... Até logo!");        
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("------------ MENU ------------");
            System.out.println("Esta ligado? " + this.getLigado());
            System.out.println("Esta tocando? " + this.getTocando());
            System.out.print("Volume " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i+=10){
                System.out.print("|");
            }
        }
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado()){
            System.out.println("\nFechando menu...");
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+1);
        }
        else{
            System.out.println("\nVerifique se o aparelho esta ligado antes.");
        }        
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-1);
        }
        else{
            System.out.println("\nVerifique se o aparelho esta ligado antes.");
        } 
        
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
        else{
            System.out.println("\nVerifique se o aparelho esta ligado antes.");
        } 
        
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
        else{
            System.out.println("\nVerifique se o aparelho esta ligado antes.");
        } 
        
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
        else{
            System.out.println("\nVerifique se o aparelho esta ligado antes.");
        } 
        
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        else{
            System.out.println("\nVerifique se o aparelho esta ligado antes.");
        } 
        
    }    
    
    
}
