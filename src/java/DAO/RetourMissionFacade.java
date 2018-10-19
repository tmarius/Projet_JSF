/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.RetourMission;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thomas
 */
@Stateless
public class RetourMissionFacade extends AbstractFacade<RetourMission> implements RetourMissionFacadeLocal {

    @PersistenceContext(unitName = "Projet_JSFPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RetourMissionFacade() {
        super(RetourMission.class);
    }
    
}
