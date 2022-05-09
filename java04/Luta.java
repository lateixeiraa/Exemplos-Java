import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;

            System.out.println("Luta marcada. Vamos começar a luta?"); 
        }
        else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }
    public void lutar(){
        if(this.aprovada){
            
            System.out.println("--- Desafiado ---");
            this.desafiado.apresentar();
            System.out.println("--- Desafiante ---");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: // Empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1: // Desafiado vence
                    System.out.println("Vitória do " + this.desafiado);
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2: // Desafiante vence
                    System.out.println("Vitória do " + this.desafiante);
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }

        else{
            System.out.println("A luta não pode acontecer.");
        }
        
    }

    // Métodos Especiais
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public int getRounds() {
        return rounds;
    }

}
