package Dao;

import Jdbc.ConnectionFactory;
import Model.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TestDao {
    private Connection con;
    
    public TestDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    	
    public void addTest(Test obj) {
        try {
            String sql = "INSERT INTO prova (id, aluno, professor, nota, disciplina) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, obj.getId());
            stmt.setString(2, obj.getStudentName());
            stmt.setString(3, obj.getProfessorName());
            stmt.setFloat(4, obj.getGrade());
            stmt.setString(5, obj.getSubject());

            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Prova cadastrada com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public void editTest(Test obj) {
        try {
            String sql = "UPDATE prova SET aluno = ?, professor = ?, nota = ?, disciplina = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, obj.getStudentName());
            stmt.setString(2, obj.getProfessorName());
            stmt.setFloat(3, obj.getGrade());
            stmt.setString(4, obj.getSubject());
            stmt.setInt(5, obj.getId());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Prova alterada com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public void deleteTest(Test obj) {
        try {
            String sql = "DELETE FROM prova WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Prova excluída com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public ArrayList<Test> listTests() {
        try {
            ArrayList<Test> lista = new ArrayList<>();
            String sql = "SELECT * FROM prova";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Test obj = new Test();
                obj.setTest(rs.getInt("id"), rs.getString("aluno"),
                        rs.getString("professor"), rs.getFloat("nota"), rs.getString("disciplina"));
                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
    
    public ArrayList<Test> filterTest(String termoPesquisa) {
        try {
            ArrayList<Test> lista = new ArrayList<>();
            String sql = "SELECT * FROM prova WHERE aluno LIKE ? OR disciplina LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + termoPesquisa + "%");
            stmt.setString(2, "%" + termoPesquisa + "%");
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Test obj = new Test();
                obj.setTest(rs.getInt("id"), rs.getString("aluno"),
                        rs.getString("professor"), rs.getFloat("nota"), rs.getString("disciplina"));
                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }  
}
