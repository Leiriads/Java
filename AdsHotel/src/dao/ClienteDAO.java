package dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Cliente;

public class ClienteDAO {
    private Connection con;
    
    public ClienteDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    // Método cadastrarCliente
    public void cadastrarCliente(Cliente obj) {
        try {
            //1 - criar comando sql
            String sql = "insert into cliente (Nome,Cpf,Email,Telefone) "
                    + "values (?,?,?,?)";
            
            //2 - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            
            //3 - executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);

        }
    }
    
    // Método alterarCliente
    public void alterarCliente(Cliente obj) {
        try {
            //1 - criar comando sql
            String sql = "update cliente set Nome=?,Cpf=?,Email=?,Telefone=? where Cpf=?";
            
            //2 - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getTelefone());
            stmt.setString(5, obj.getCpf());
            
            //3 - executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Alterar com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);

        }
    }
    
    // Método excluirCliente
    public void excluirCliente(Cliente obj) {
        try {
            //1 - criar comando sql
            String sql = "delete from cliente where Cpf = ?";
            
            //2 - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,obj.getCpf());
            
            //3 - executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);

        }
    }
    
    // Método listarCliente
    public ArrayList<Cliente> listarClientes() {
        try {
            //1 - criar a lista
            ArrayList<Cliente> lista = new ArrayList<>();
            
            //2 - criar sql, organizar e executar
            String sql = "select * from cliente";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                Cliente obj = new Cliente();
                
                obj.setCliente(rs.getString("Nome"), rs.getString("Cpf"), rs.getString("Email"), rs.getString("Telefone"));
                
                lista.add(obj);
            }
            
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
    
    //Método buscar cliente por Nome
    public List<Cliente> consultaClientesPorNome(String nome) {
        try {
            
            // 1 - criar a lista
            List<Cliente> lista = new ArrayList<>();
            
            //2 - criar o sql, organizar e executar
            String sql = "select * from cliente where Nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                Cliente obj = new Cliente();
                
                obj.setCliente(rs.getString("Nome"), rs.getString("Cpf"), rs.getString("Email"), rs.getString("Telefone"));
                
                lista.add(obj);
            }
            
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
    
    //Método buscar cliente por CPF
    public Cliente buscaClientePorCpf(String cpf) {
        try {
            // 1 - criar o sql, organizar e executar
            String sql = "select * from cliente where Cpf=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);
            
            ResultSet rs = stmt.executeQuery();
            
            Cliente obj = new Cliente();

            
            if(rs.next()) {
                
                obj.setCliente(rs.getString("Nome"), rs.getString("Cpf"), rs.getString("Email"), rs.getString("Telefone"));

            }
            
            return obj;
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
}
