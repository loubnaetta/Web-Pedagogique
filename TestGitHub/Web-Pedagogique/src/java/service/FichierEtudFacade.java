/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.FichierEtud;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author loubna
 */
@Stateless
public class FichierEtudFacade extends AbstractFacade<FichierEtud> {

    @PersistenceContext(unitName = "Web-PedagogiquePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FichierEtudFacade() {
        super(FichierEtud.class);
    }
    
}
