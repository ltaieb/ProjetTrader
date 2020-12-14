/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Entity.Achats;
import Entity.Action;
import Entity.Trader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author liort
 */
public class FonctionsMetier implements IMetier{

    @Override
    public ArrayList<Action> getAllActions() {
        ArrayList<Action> lesActions = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            ResultSet rs;
            PreparedStatement stm;
            stm = cnx.prepareStatement("select idAction, nomAction from action");
            System.out.println(stm);
            rs = stm.executeQuery();
            while (rs.next())
            {
                Action act = new Action(rs.getInt(1),rs.getString(2));
                lesActions.add(act);
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesActions;
    }

    @Override
    public void insertAction(int idAction, String unNomAction){
        try {
            Connection cnx = ConnexionBDD.getCnx();
            
            PreparedStatement stm;
            ResultSet rs;
            stm = cnx.prepareStatement("insert into action values ('"+idAction +"','"+ unNomAction+"',0 )");
            System.out.println(stm);
            stm.executeUpdate(); 
            stm.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getLastIdAction() {
        return 0;
    }

    @Override
    public Action getActionById(int idAction) {
        Action act = null;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            ResultSet rs;
            PreparedStatement stm;
            stm = cnx.prepareStatement("select idAction, nomAction from action where idAction ="+ idAction);
            System.out.println(stm);
            rs = stm.executeQuery();
            
               act = new Action(rs.getInt(1),rs.getString(2));
                
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return act;
    }

    @Override
    public void updateAction(int idAction, String unNomAction) {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            ResultSet rs;
            PreparedStatement stm;
            stm = cnx.prepareStatement("update action set nomAction='"+unNomAction+"' where idAction='"+idAction );
            System.out.println(stm);
            stm.executeUpdate();
            stm.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public ArrayList<Trader> getAllTraders() {
        ArrayList<Trader> lesTraders = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            ResultSet rs;
            PreparedStatement stm;
            stm = cnx.prepareStatement("select idTrader, nomTrader from trader");
            System.out.println(stm);
            rs = stm.executeQuery();
            while (rs.next())
            {
                Trader tra = new Trader(rs.getInt(1),rs.getString(2));
                lesTraders.add(tra);
            }
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesTraders;
    }

    @Override
    public ArrayList<Achats> getAllActionsByIdTrader(int idTrader) {
        ArrayList<Achats> mesAchats = new ArrayList<>();
       try {
            Connection cnx = ConnexionBDD.getCnx();
            ResultSet rs;
            PreparedStatement stm;
            stm = cnx.prepareStatement("select idAction, nomAction, prixAchat,quantite from action,acheter where trader.idTrader= acheter.numTrader and numeroActivite="+idTrader);
            System.out.println(stm);
            rs = stm.executeQuery();
            while (rs.next())
            {
                Achats ach = new Achats(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
                mesAchats.add(ach);
            }
            rs.close();
            } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesAchats;
    }

    @Override
    public double getMontantAchatByIdTrader(int idTrader) {
        return 0;
    }
    
    
}
