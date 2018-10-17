/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profil;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Classe qui permet de gerer les utilisateurs
 * @author Thomas
 */
@ManagedBean
@ViewScoped
public class Utilisateur {
 
    private int Id_Membre;
    private int Rang;
    private int Id_Jeux;
    private String nom;
    private String prenom;
    private String pseudo;
    private boolean vivant;
    private boolean deja_cible;
    private int doit_tuer;
    
    
    
    public int getId_Membre() {
        return Id_Membre;
    }

    public void setId_Membre(int Id_Membre) {
        this.Id_Membre = Id_Membre;
    }

    public int getRang() {
        return Rang;
    }

    public void setRang(int Rang) {
        this.Rang = Rang;
    }

    public int getId_Jeux() {
        return Id_Jeux;
    }

    public void setId_Jeux(int Id_Jeux) {
        this.Id_Jeux = Id_Jeux;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public boolean isVivant() {
        return vivant;
    }

    public void setVivant(boolean vivant) {
        this.vivant = vivant;
    }

    public boolean isDeja_cible() {
        return deja_cible;
    }

    public void setDeja_cible(boolean deja_cible) {
        this.deja_cible = deja_cible;
    }

    public int getDoit_tuer() {
        return doit_tuer;
    }

    public void setDoit_tuer(int doit_tuer) {
        this.doit_tuer = doit_tuer;
    }
    
    
    
    
    
    
}
