package jdbc;

import javax.swing.JOptionPane;

public class ConnectionTest {
    
    public boolean testandoconexao(){
        try {
            new ConnectionFactory().getConnection();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops aconteceu um erro \n O Banco de Dados está Offline!");
            return false;
        }
    }
   
}