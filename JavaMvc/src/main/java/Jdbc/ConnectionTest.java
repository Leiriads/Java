package jdbc;

import javax.swing.JOptionPane;

public class ConnectionTest {
    
    public void testandoconexao(){
        try {
            new ConnectionFactory().getConnection();
            System.out.println("YES");
            JOptionPane.showMessageDialog(null, "Conectado com scucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ops aconteceu um erro");
        }
    }
   
}