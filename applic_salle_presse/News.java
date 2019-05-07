
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applic_salle_presse;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Kevin
 */
public class News {
    private String _titre;
    private String _texte;
    private Categorie _categorie;
    private int _identifiant;
    private Source _source;
    private Journaliste _journaliste;
    private Date _date;
    private boolean _important;
    private Vector _motcle;
    
    public News(){}
    public News(String titre, String texte, Categorie categorie, Journaliste journaliste, Date date, boolean important, Vector motcle) {
        setTitre(titre);
        setTexte(texte);
        setCategorie(categorie);
        setJournaliste(journaliste);
        setDate(date);
        setImportant(important);
        setMotCle(motcle);
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
    public Categorie getCategorie() {
        return _categorie;
    }
    public void setCategorie(Categorie categorie) {
        this._categorie = categorie;
    }
    public int getIdentifiant() {
        return _identifiant;
    }
    public void setIdentifiant(int identifiant) {
        this._identifiant = identifiant;
    }
    public Source getSource() {
        return _source;
    }
    public void setSource(Source source) {
        this._source = source;
    }
    public Journaliste getJournaliste() {
        return _journaliste;
    }
    public void setJournaliste(Journaliste journaliste) {
        this._journaliste = journaliste;
    }
    public Date getDate() {
        return _date;
    }
    public void setDate(Date date) {
        this._date = date;
    }
    public boolean getImportant() {
        return _important;
    }
    public void setImportant(Boolean important) {
        this._important = important;
    }
    public Vector getMotCle() {
        return _motcle;
    }
    public void setMotCle(Vector motcle) {
        this._motcle = motcle;
    }
    public String toString()
    {
        return getTitre();
    }
}