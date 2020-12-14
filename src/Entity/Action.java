/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author liort
 */
public class Action {
    
    private int idAction ;
    private String nomAction ;
    
    public Action(int unId, String unNom)
    {
        idAction = unId;
        nomAction = unNom;
    }

    /**
     * @return the idAction
     */
    public int getIdAction() {
        return idAction;
    }

    /**
     * @param idAction the idAction to set
     */
    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    /**
     * @return the nomAction
     */
    public String getNomAction() {
        return nomAction;
    }

    /**
     * @param nomAction the nomAction to set
     */
    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }
}
