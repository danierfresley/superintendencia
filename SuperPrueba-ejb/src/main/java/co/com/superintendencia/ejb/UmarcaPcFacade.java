/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.superintendencia.ejb;

import co.com.superintendencia.entidad.UmarcaPc;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author danier
 */
@Stateless
public class UmarcaPcFacade extends AbstractFacade<UmarcaPc> {

    @PersistenceContext(unitName = "co.com.superintendencia_SuperPrueba-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UmarcaPcFacade() {
        super(UmarcaPc.class);
    }
    
    public List<UmarcaPc> listUMarcaPC() {
        Query q = em.createNamedQuery("UmarcaPc.findAll");
        return q.getResultList();
    }
    
}
