package Controller;
import Model.Test;
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
    public void fillTable(ArrayList<Test> lista, JTable tabela) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.setRowCount(0);
        for (Object obj : lista) {
            // assumindo que o tipo do objeto possua os métodos
            Object[] row = { ((Test) obj).getId(), ((Test) obj).getStudentName(), ((Test) obj).getProfessorName(), ((Test) obj).getGrade(),((Test) obj).getSubject()};
            model.addRow(row); 
        }
    }
}


