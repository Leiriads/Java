package dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import Model.User;

public class usuarioDAO {
    private Connection con;
    
    public usuarioDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    // Método cadastrarCliente
    public void cadastrarCliente(User obj){
        try {
            //1 - criar comando sql
            String sql = "INSERT INTO usuario (nome,cpf,tipousuario)"
                    + "VALUES (?,?,?)";
            //2 - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            //stmt.setInt(1, obj.getId());
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            //stmt.setInt(4, obj.getTipousuario());
            stmt.setString(3,obj.getTipousuario());
            //3 - executar o comando sql
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    // Método alterarCliente
    public void alterarCliente(User obj) {
        try {
            //1 - criar comando sql
            String sql = "UPDATE usuario SET nome=?,cpf=?,tipousuario=? where id=?";
            //2 - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCpf());
            stmt.setString(3,obj.getTipousuario());
            stmt.setInt(4, obj.getId());
            //3 - executar o comando sql
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);

        }
    }
    
    // Funcão excluir Usuário
    public void excluirCliente(User obj) {
        try {
            //1 - criar comando sql
            String sql = "DELETE FROM usuario WHERE id = ?";
            //2 - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getId());
            //3 - executar o comando sql
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    // Função listar Usuario
    public ArrayList<User> listarUsuario() {
        try {
            //1 - criar a lista
            ArrayList<User> lista = new ArrayList<>();
            
            //2 - criar sql, organizar e executar
            String sql = "SELECT * FROM usuario";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                User obj = new User();
                obj.setUserBd(rs.getInt("id"),rs.getString("nome"),
                rs.getString("cpf"), rs.getString("tipousuario"));
                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
    // Função filtrar Usuario por Nome ou Cpf
     public ArrayList<User> filtrarusuarios(String termoPesquisa) {
        try {
            //1 - criar a lista
            ArrayList<User> lista = new ArrayList<>();
            
            //2 - criar sql, organizar e executar
           String sql = "SELECT * FROM usuario WHERE nome LIKE ? OR cpf LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + termoPesquisa + "%");
            stmt.setString(2, "%" + termoPesquisa + "%");
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                User obj = new User();
                obj.setUserBd(rs.getInt("id"), rs.getString("nome"),
                rs.getString("cpf"), rs.getString("tipousuario"));
                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }  
}