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
public class Trader {
    private int idTrader ;
    private String nomTrader ;
    
    public Trader(int unIdTra, String unNomTra)
    {
        idTrader = unIdTra;
        nomTrader = unNomTra;
    }

    /**
     * @return the idTrader
     */
    public int getIdTrader() {
        return idTrader;
    }

    /**
     * @param idTrader the idTrader to set
     */
    public void setIdTrader(int idTrader) {
        this.idTrader = idTrader;
    }

    /**
     * @return the nomTrader
     */
    public String getNomTrader() {
        return nomTrader;
    }

    /**
     * @param nomTrader the nomTrader to set
     */
    public void setNomTrader(String nomTrader) {
        this.nomTrader = nomTrader;
    }
    
}
