package Fila;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel{

    private List<Pessoa> dados = new ArrayList<>();
    private String[] colunas={"Nome", "Idade","Hora            Data"};

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
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getIdade();
            case 2:
                return dados.get(linha).getHora();   
        }
        return null;
    }
    public void addRow(Pessoa p){
        this.dados.add(p);
        
        this.fireTableDataChanged();
}
    public void removeRow(Pessoa row) { 
        this.dados.remove(row);
        this.fireTableDataChanged();
    } 
    public void changed(){
        this.fireTableDataChanged();
    }
    
}
