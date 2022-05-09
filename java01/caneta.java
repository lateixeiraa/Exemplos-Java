public class caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Estado: " + this.tampada);
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("A caneta ta tampada, não da pra rabiscar");
        }
        else{
            System.out.println("Pronta para rabiscar");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }

}
