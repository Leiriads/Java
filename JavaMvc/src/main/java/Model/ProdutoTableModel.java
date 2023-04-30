package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel{

    private List<User> dados = new ArrayList<>();
    private String[] colunas={"Id", "Nome","Cpf","Usuário"};

    @Override
    public String getColumnName(int column) { 
        return colunas[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    @Override
    public int getRowCount() { 
        return dados.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        switch(coluna){
            case 0:
                return dados.get(linha).getId();
            case 1:
                return dados.get(linha).getNome();
            case 2:
                return dados.get(linha).getCpf(); 
            case 3:
                return dados.get(linha).getTipousuario();
        }
        return null;
    }
    public void addRow(User u){
        this.dados.add(u);
        
        this.fireTableDataChanged();
}
    public void removeRow(User row) { 
        this.dados.remove(row);
        this.fireTableDataChanged();
    } 
    public void changed(){
        this.fireTableDataChanged();
    }
    
}

