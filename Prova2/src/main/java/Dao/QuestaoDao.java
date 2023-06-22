package Dao;

import Jdbc.ConnectionFactory;
import Model.Questao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class QuestaoDao {
    private Connection con;
    
    public QuestaoDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void cadastrarQuestao(Questao obj) {
        try {
            String sql = "INSERT INTO questao (id, enunciado, resposta_correta, peso_questao) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, obj.getId());
            stmt.setString(2, obj.getEnunciado());
            stmt.setString(3, String.valueOf(obj.getRespostaCorreta()));
            stmt.setFloat(4, obj.getPesoQuestao());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Questão cadastrada com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public void alterarQuestao(Questao obj) {
        try {
            String sql = "UPDATE questao SET enunciado = ?, resposta_correta = ?, peso_questao = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, obj.getEnunciado());
            stmt.setString(2, String.valueOf(obj.getRespostaCorreta()));
            stmt.setFloat(3, obj.getPesoQuestao());
            stmt.setInt(4, obj.getId());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Questão alterada com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public void excluirQuestao(Questao obj) {
        try {
            String sql = "DELETE FROM questao WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Questão excluída com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
        }
    }
    
    public ArrayList<Questao> listarQuestoes() {
        try {
            ArrayList<Questao> lista = new ArrayList<>();
            String sql = "SELECT * FROM questao";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Questao obj = new Questao();
                obj.setQuestao(rs.getInt("id"), rs.getString("enunciado"),
                        rs.getString("resposta_correta").charAt(0), rs.getFloat("peso_questao"));
                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }
    
    public ArrayList<Questao> filtrarQuestoes(String termoPesquisa) {
        try {
            ArrayList<Questao> lista = new ArrayList<>();
            String sql = "SELECT * FROM questao WHERE enunciado LIKE ? OR resposta_correta LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + termoPesquisa + "%");
            stmt.setString(2, "%" + termoPesquisa + "%");
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Questao obj = new Questao();
                obj.setQuestao(rs.getInt("id"), rs.getString("enunciado"),
                        rs.getString("resposta_correta").charAt(0), rs.getFloat("peso_questao"));
                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }
    }  
}
