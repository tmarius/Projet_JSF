/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import DAO.MembreFacadeLocal;
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

    
    @EJB
    MembreFacadeLocal membreDao;
    /**
     * Creates a new instance of Vue
     */
    public Vue() {
    }
    
    public List<Membre> getListeMembre() {
    return  membreDao.findAll(); 
    }
    
    
}
