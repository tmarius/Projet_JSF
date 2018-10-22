/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import DAO.JeuxFacadeLocal;
import DAO.MembreFacadeLocal;
import Entity.Jeux;
import Entity.Membre;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;



        
/**
 *
 * @author Thomas
 */
@Named(value = "vue")
@SessionScoped
public class Vue implements Serializable {

    private int id;
    private String nom;
    private String prenom;
    private int idjeux;
    private String pseudo;
    private Membre mb;
    
    @EJB
    MembreFacadeLocal membreDao;
   
    @EJB
    JeuxFacadeLocal jeuxDao;
    /**
     * Creates a new instance of Vue
     */
    public Vue() {
    }
    
    public List<Membre> getListeMembre() {
    return  membreDao.findAll(); 
    }
    

    public void ajouter() {
        
    Membre mb2 = new Membre();
    mb2.setIdMembre(id);
    mb2.setNomMembre(nom);
    mb2.setPrenomMembre(prenom);
    Jeux lejeux = jeuxDao.find(idjeux);
    mb2.setIdJeux(lejeux);
    mb2.setCodeMembre(pseudo);
    membreDao.create(mb2);
    
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    public List<Jeux> getListeJeux() {
    return jeuxDao.findAll();
    }
    
    public void ajouterJeux() {
    Jeux unjeux = new Jeux();
    unjeux.setIdJeux(4);
    jeuxDao.create(unjeux);
    }
    
    
    public void ajouterMembre() {
    Membre mb2 = new Membre();
    mb.setNomMembre(nom);
    membreDao.create(mb2);
    }
    
    
    //requete fait avec create query CODE

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setIdjeux(int idjeux) {
        this.idjeux = idjeux;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMembreDao(MembreFacadeLocal membreDao) {
        this.membreDao = membreDao;
    }

    public void setJeuxDao(JeuxFacadeLocal jeuxDao) {
        this.jeuxDao = jeuxDao;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getIdjeux() {
        return idjeux;
    }

    public String getPseudo() {
        return pseudo;
    }

    public MembreFacadeLocal getMembreDao() {
        return membreDao;
    }

    public JeuxFacadeLocal getJeuxDao() {
        return jeuxDao;
    }
    
    
}
