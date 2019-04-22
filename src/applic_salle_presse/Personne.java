/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applic_salle_presse;

/**
 *
 * @author Kevin
 */
public class Personne implements Identifiable {
    private String _nom;
    private String _prenom;
    private String _numCI;
    
    public String getNom() {
        return _nom;
    }
    public void setNom(String nom) {
        this._nom = nom;
    }
}
