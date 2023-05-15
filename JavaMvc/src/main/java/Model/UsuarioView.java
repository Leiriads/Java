package Model;

/**
 * @author DevL
 */

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UsuarioView extends JTable {
    
    public UsuarioView() {
        super(new DefaultTableModel(new Object[]{"ID", "Nome", "CPF", "Tipo de Usuário"}, 0));
    }
    
    public void popularTabela(List<User> usuarios) {
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.setRowCount(0);
        for (User usuario : usuarios) {
            Object[] row = new Object[]{usuario.getId(), usuario.getNome(), usuario.getCpf(), usuario.getTipousuario()};
            model.addRow(row);
        }
    }
}
