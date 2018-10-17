/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profil;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Classe permettant de gérer les membres d'un jeu
 * @author Thomas
 */
@ManagedBean
@ViewScoped
public class ListeU {
    
    private int iD_jeu;
    private ArrayList<Utilisateur> ListeUtilisateur;

    /*
    Attribue les cibles de façon random a tout les membres actifs
    Membre actif = vivant et pas déja_ciblé
    */
    public void attribuer_cible() {
    
    }
    
    public int getiD_jeu() {
        return iD_jeu;
    }

    public void setiD_jeu(int iD_jeu) {
        this.iD_jeu = iD_jeu;
    }

    public ArrayList<Utilisateur> getListeUtilisateur() {
        return ListeUtilisateur;
    }

    public void setListeUtilisateur(ArrayList<Utilisateur> ListeUtilisateur) {
        this.ListeUtilisateur = ListeUtilisateur;
    }
    
    
    
    
}
