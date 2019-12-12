/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.superintendencia.ejb;

import co.com.superintendencia.entidad.UformularioEncuenta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author danier
 */
@Stateless
public class UformularioEncuentaFacade extends AbstractFacade<UformularioEncuenta> {

    @PersistenceContext(unitName = "co.com.superintendencia_SuperPrueba-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UformularioEncuentaFacade() {
        super(UformularioEncuenta.class);
    }
    
}
