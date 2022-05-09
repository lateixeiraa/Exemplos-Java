public class banco {
    public static void main(String[] args) {
        cliente c1 = new cliente();
        c1.abrirConta("Jubileu","CP");
        c1.depositar(300);
        

        cliente c2 = new cliente();
        c2.abrirConta("Creuza","CC");
        c2.depositar(500);
        c2.sacar(100);

        
    }

}
