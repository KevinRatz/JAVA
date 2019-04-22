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
public class News {
    private String _titre;
    private String _texte;
    
    public News(String titre, String texte) {
        setTitre(titre);
        setTexte(texte);
    }
    
    public String getTitre() {
        return _titre;
    }
    public void setTitre(String titre) {
        this._titre = titre;
    }
    
    public String getTexte() {
        return _texte;
    }
    public void setTexte(String texte) {
        this._texte = texte;
    }
}
