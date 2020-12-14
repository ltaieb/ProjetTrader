/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Action;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author liort
 */
public class ModelAction extends AbstractTableModel
{
    private String[] nomsColonnes;
    private Vector<String[]> rows;
    
    @Override
    public int getRowCount()
    {
        return rows.size();
    }

    @Override
    public int getColumnCount()
    {
        return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        return rows.get(rowIndex)[columnIndex];
    }
    
    public String getColumnName(int columnIndex) 
    { 
        return nomsColonnes[columnIndex]; 
    }
    
    public void loadAction(ArrayList<Action> lesActions)
    {
        rows = new Vector<>();
        nomsColonnes = new String[]{"Numéro", "Nom"};
        for (Action act : lesActions)
        {
            rows.add(new String[]{String.valueOf(act.getIdAction()),act.getNomAction()});
        }
        fireTableChanged(null);
    }
    
}
