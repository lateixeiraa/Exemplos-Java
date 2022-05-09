public class cliente{
    public int numConta;
    protected String tipo;
    private String dono;
    private  float saldo;
    private  boolean status; 
    public float valor;

    //construtor não parametizado
    public cliente(){
        saldo = 0;
        status = false; 
    }

    // Métodos

    public void abrirConta(String dono, String tipo){   
        if(status == false){
            status = true;
            this.dono = dono;
            this.tipo = tipo;

            numConta = 0;
            numConta = numConta +1;

            if (this.tipo == "CC"){
                saldo = 50;
    
            }
            else if(this.tipo == "CP"){
                saldo = 150;
    
            }
            System.out.println("Seja Bem-vindo, " + this.dono);
            System.out.println("Informações sobre sua conta:");
            System.out.println("Conta do tipo: " + this.tipo);
            System.out.println("Número da Conta: " + this.numConta);
            System.out.println("Seu saldo atual é: " + this.saldo);

        }        
    }
    public void fecharConta(){
        if(status == true){

            if(saldo!= 0){
                this.saldo -= saldo;
                System.out.println("Obrigado por ser nosso cliente, " + this.dono);
            } 
            else if(saldo == 0){
                status = false;
                System.out.println("Obrigado por ser nosso cliente, " + this.dono);
            } 
        }        
    }
    public void depositar(float valor){
        if(status == true){
            this.saldo += valor;
            System.out.println("Seu novo saldo é " + this.saldo);
        }
    }
    public void sacar(float valor){
        if(status == true){
            if(valor <= saldo){
                this.saldo -= valor;
                System.out.println("Seu novo saldo é " + this.saldo);
            }
            else{
                System.out.println("Você não possui saldo suficiente. Tente outro valor.");
            }
        }   
    }
    public void pagarMensal(){
        if(status == true && saldo > 0){
            if(tipo == "CC"){
                this.saldo -= 12;
            }
            if(tipo == "CP"){
                this.saldo -= 20;
            }            
        }
    }

    // Set e get usados para segurança dos argumentos

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public float getValor() {
        return valor;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public String getDono() {
        return dono;
    }
}