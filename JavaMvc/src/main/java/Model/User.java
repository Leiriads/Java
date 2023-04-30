package Model;
/**
 *
 * @author Leiria
 */
public class User {
    private int id;
    private String nome;
    private String cpf;
    private String tipousuario;

     public void setUser(String nome, String cpf, String tipousuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipousuario = tipousuario;
        
    }
     
    public void setUserBd(Integer id, String nome, String cpf, String tipousuario) {
        this.id= id;
        this.nome = nome;
        this.cpf = cpf;
        this.tipousuario = tipousuario;
        
    }
    
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    
    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    
    public String getTipousuario(){return tipousuario;}
    public void setTipousuario(String tipousuario){this.tipousuario = tipousuario;}
    
}
