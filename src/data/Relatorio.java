/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucas
 */
public class Relatorio extends AbstractTableModel {
      private static final String[] colNomes={
        "DATA", "SOMA"
    };
    
    private ArrayList<String[]> ResultSets;
    
       
    public Relatorio( ResultSet rs ) throws SQLException {
        setResult( rs );
    }
        
            
        
     
    public void setResult( ResultSet rs ) throws SQLException{
         
        ResultSets = new ArrayList<String[]>();
        
        while (rs.next()){
            String[] row = {
                rs.getString("DATA"),
                rs.getString("SOMA"),
            };

            ResultSets.add(row);                    
        }
        
        fireTableStructureChanged();
    }
            
    
    

    @Override
    public int getRowCount() {
        return ResultSets.size();
    }

    @Override
    public int getColumnCount() {
        return colNomes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] row = ResultSets.get(rowIndex);
        return row[columnIndex];
    }
    
    
}
