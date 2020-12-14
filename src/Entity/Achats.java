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
public class Achats {
    private int numAction ;
    private String nom ;
    private double montantAchat ;
    private int quantite ;
    
    
    public Achats(int unNumAction, String unNom, double unMontantAchat, int uneQuantite)
    {
        numAction = unNumAction;
        nom = unNom;
        montantAchat = unMontantAchat;
        quantite = uneQuantite;
    }

    /**
     * @return the numAction
     */
    public int getNumAction() {
        return numAction;
    }

    /**
     * @param numAction the numAction to set
     */
    public void setNumAction(int numAction) {
        this.numAction = numAction;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the montantAchat
     */
    public double getMontantAchat() {
        return montantAchat;
    }

    /**
     * @param montantAchat the montantAchat to set
     */
    public void setMontantAchat(double montantAchat) {
        this.montantAchat = montantAchat;
    }

    /**
     * @return the quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    
}
