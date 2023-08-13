package aula_pratica03;

public class Pessoa {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the data_de_nascimento
     */
    public Data getData_de_nascimento() {
        return data_de_nascimento;
    }

    /**
     * @param data_de_nascimento the data_de_nascimento to set
     */
    public void setData_de_nascimento(Data data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }
    private String nome;
    private String CPF;
    private Data data_de_nascimento;
    
    
}
