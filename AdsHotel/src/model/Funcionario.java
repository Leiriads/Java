package model;

public class Funcionario {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setFuncionario(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
