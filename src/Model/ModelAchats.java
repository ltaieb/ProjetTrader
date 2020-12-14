/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Achats;
import Entity.Action;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author liort
 */
public class ModelAchats extends AbstractTableModel
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
    
    public void loadAction(ArrayList<Achats> lesAchats)
    {
        rows = new Vector<>();
        nomsColonnes = new String[]{"Numéro", "Nom","Montant","Quantité"};
        for (Achats ach : lesAchats)
        {
            rows.add(new String[]{String.valueOf(ach.getNumAction()),ach.getNom(),String.valueOf(ach.getMontantAchat()),String.valueOf(ach.getQuantite())});
        }
        fireTableChanged(null);
    }
    
}
