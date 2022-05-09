public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    // Método público
    public void fazerAniver() {
        this.setIdade(getIdade()+1);
        if(getSexo() == "Feminino"){
            System.out.println("Feliz aniversário, querida leitora");
        }
        else if(getSexo() == "Masculino"){
            System.out.println("Feliz aniversário, querido leitor");
        }  
        
        // this.idade = idade +1;
    }
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Métodos especiais
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }

}