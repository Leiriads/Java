package tablemodel;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Cliente;

public class ClienteTableModel extends AbstractTableModel {
    
    //linhas da tabela
    ArrayList<Cliente> linhas;
    
    //vetor de colunas
    String[] colunas = {"Nome", "CPF", "Email", "Telefone"};
    
    //construtor da classe padrão (vazio)
    public ClienteTableModel() {
        linhas = new ArrayList<>();
    }
    
    //construtor de classe sobrecarga
    public ClienteTableModel(ArrayList<Cliente> clientes) {
        linhas = new ArrayList<>(clientes);
    }
     
    //adicionar cliente na lista
    public Cliente getCliente(int linha) {
        return linhas.get(linha);
    }
    
    public void adicionarCliente(Cliente cliente) {
        linhas.add(cliente); // adiciona cliente
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
        Cliente cliente = linhas.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getCpf();
            case 2:
                return cliente.getEmail();
            case 3:
                return cliente.getTelefone();
            default:
                return "Não tem";
        }
    }
}
