/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entity.Agencia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cristiian
 */
@Stateless
public class AgenciaFacade extends AbstractFacade<Agencia> {
    @PersistenceContext(unitName = "jpaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgenciaFacade() {
        super(Agencia.class);
    }
    
}
