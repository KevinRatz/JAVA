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
    
    public Personne()
    {
        
    }
    
    public Personne(String nom, String prenom, String cId)
    {
        setNom(nom);
        setPrenom(prenom);
        setNumCI(cId);
    }
    
    public String getNom() {
        return _nom;
    }
    public void setNom(String nom) {
        this._nom = nom;
    }
    public String getPrenom() {
        return _prenom;
    }
    public void setPrenom(String prenom) {
        this._prenom = prenom;
    }
    public String getNumCI() {
        return _numCI;
    }
    public void setNumCI(String numCI) {
        this._numCI = numCI;
    }
}