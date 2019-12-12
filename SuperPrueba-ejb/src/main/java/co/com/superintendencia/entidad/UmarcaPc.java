/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.superintendencia.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author danier
 */
@Entity
@Table(name = "UMARCA_PC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UmarcaPc.findAll", query = "SELECT u FROM UmarcaPc u")
    , @NamedQuery(name = "UmarcaPc.findById", query = "SELECT u FROM UmarcaPc u WHERE u.id = :id")
    , @NamedQuery(name = "UmarcaPc.findByDescripcion", query = "SELECT u FROM UmarcaPc u WHERE u.descripcion = :descripcion")})
public class UmarcaPc implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 20)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "marcaPcFk")
    private List<UformularioEncuenta> uformularioEncuentaList;

    public UmarcaPc() {
    }

    public UmarcaPc(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<UformularioEncuenta> getUformularioEncuentaList() {
        return uformularioEncuentaList;
    }

    public void setUformularioEncuentaList(List<UformularioEncuenta> uformularioEncuentaList) {
        this.uformularioEncuentaList = uformularioEncuentaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UmarcaPc)) {
            return false;
        }
        UmarcaPc other = (UmarcaPc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.superintendencia.entidad.UmarcaPc[ id=" + id + " ]";
    }
    
}
