/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Entity.Achats;
import Entity.Action;
import Entity.Trader;
import java.util.ArrayList;

/**
 *
 * @author liort
 */
public interface IMetier {
    public ArrayList<Action> getAllActions();
    public void insertAction(int idAction, String unNomAction);
    public int getLastIdAction();
    public Action getActionById(int idAction);
    public void updateAction(int idAction, String unNomAction);
    public ArrayList<Trader> getAllTraders();
    public ArrayList<Achats> getAllActionsByIdTrader(int idTrader);
    public double getMontantAchatByIdTrader(int idTrader);
    
}
