
public class Contato {
 
    private String nome;
    private String sexo;
    private String cpf;

    public Contato() {
    }

    public Contato(String nome, String sexo, String cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf + '}';
    }
    
}