package View;

import Model.ProdutoTableModel;
import Model.User;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class UserTableModel extends AbstractTableModel {
    
    ProdutoTableModel tablemodel = new ProdutoTableModel();
    
    //linhas da tabela
    ArrayList<User> linhas;
    
    //vetor de colunas
    String[] colunas = {"Nome", "CPF", "Email", "Telefone"};
    
    //construtor da classe padrão (vazio)
    public UserTableModel() {
        linhas = new ArrayList<>();
    }
    
    //construtor de classe sobrecarga
    public UserTableModel(ArrayList<User> user) {
        linhas = new ArrayList<>(user);
    }
     
    //adicionar cliente na lista
    public User getCliente(int linha) {
        return linhas.get(linha);
    }
    
    public void adicionarCliente(User user) {
        linhas.add(user); // adiciona cliente
        int qtdeLinhas = getRowCount() - 1; // -1 pq retira da contagem o cabeçalho
        fireTableRowsInserted(1, qtdeLinhas);
    }
    
    
    //remover

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User user = linhas.get(rowIndex);
        switch(columnIndex) {
            case 0:
                 return user.getId();
            case 1:
                return user.getNome();
            case 2:
                return user.getCpf();
            case 3:
               return user.getTipousuario();
            default:
                return "Não tem";
        }
    }
}