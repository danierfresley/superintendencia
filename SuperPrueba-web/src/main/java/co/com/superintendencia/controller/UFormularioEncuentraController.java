/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.superintendencia.controller;

import co.com.superintendencia.ejb.UformularioEncuentaFacade;
import co.com.superintendencia.entidad.UformularioEncuenta;
import co.com.superintendencia.entidad.UmarcaPc;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author danier
 */
@Named(value = "uFormularioEncuentraController")
@SessionScoped
public class UFormularioEncuentraController implements Serializable {

    @EJB
    private UformularioEncuentaFacade uformularioEncuentaFacade;
    
    private UformularioEncuenta uformularioEncuenta = new UformularioEncuenta();
    
    private UmarcaPc marcaPc = new UmarcaPc();
    
    private List<UmarcaPc> listMarcaPc = new ArrayList<>();
    

    /**
     * Creates a new instance of UFormularioEncuentraController
     */
    public UFormularioEncuentraController() {
    }
    
    public List<UformularioEncuenta> listaFormularioEncuensta() {
        return uformularioEncuentaFacade.findAll();
    }
    
    public String AddUFormularioEncuesta() {
        
        uformularioEncuentaFacade.create(uformularioEncuenta);
        this.uformularioEncuenta = new UformularioEncuenta();
        return "index";
    }
    
    public String prepareEditUFormularioEncuesta(UformularioEncuenta formulario) {
        this.uformularioEncuenta = formulario;
        return "edit";
    }
    
    public String editUFormularioEncuesta() {
        this.uformularioEncuentaFacade.edit(this.uformularioEncuenta);
        this.uformularioEncuenta = new UformularioEncuenta();
        return "index";
    }
    
    public void deleteUFormularioEncuenta(UformularioEncuenta formulario) {
        this.uformularioEncuentaFacade.remove(formulario);
    }

    public UformularioEncuenta getUformularioEncuenta() {
        return uformularioEncuenta;
    }

    public void setUformularioEncuenta(UformularioEncuenta uformularioEncuenta) {
        this.uformularioEncuenta = uformularioEncuenta;
    }

    public UmarcaPc getMarcaPc() {
        return marcaPc;
    }

    public void setMarcaPc(UmarcaPc marcaPc) {
        this.marcaPc = marcaPc;
    }

    public List<UmarcaPc> getListMarcaPc() {
        return listMarcaPc;
    }

    public void setListMarcaPc(List<UmarcaPc> listMarcaPc) {
        this.listMarcaPc = listMarcaPc;
    }
    
    
}
