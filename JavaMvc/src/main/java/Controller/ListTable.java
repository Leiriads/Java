package Controller;
import Model.User;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DevL
 */

// Criado para popular qualquer tipo de tabela com base em alguama lista
// nao esquecer de passar o nome da jtable em 'tabela' 
public class ListTable {
    public void preenchertabela(ArrayList<User> lista, JTable tabela) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);
        for (Object obj : lista) {
            // assumindo que o tipo do objeto possua os métodos getId(), getNome(), getCpf() e getTipoUsuario()
            Object[] row = { ((User) obj).getId(), ((User) obj).getNome(), ((User) obj).getCpf(), ((User) obj).getTipousuario() };
            model.addRow(row); 
        }
    }
}