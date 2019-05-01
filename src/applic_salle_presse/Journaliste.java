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
public class Journaliste extends Personne{
    private int _numCartePresse;
    private String _login;
    
    public Journaliste()
    {
        _numCartePresse=0;
        _login = "";
    }
    
    public Journaliste(int numPresse,String login)
    {
        setCartePresse(numPresse);
        setLogin(login);
        
    }
    
    public int getCartePresse() {
        return _numCartePresse;
    }

    public void setCartePresse(int numCartePresse) {
        this._numCartePresse = numCartePresse;
    }
    
    public String getLogin() {
        return _login;
    }

    public void setLogin(String login) {
        this._login = login;
    }
}