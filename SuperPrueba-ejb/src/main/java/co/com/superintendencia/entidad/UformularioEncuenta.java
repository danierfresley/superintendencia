/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.superintendencia.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danier
 */
@Entity
@Table(name = "UFORMULARIO_ENCUENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UformularioEncuenta.findAll", query = "SELECT u FROM UformularioEncuenta u")
    , @NamedQuery(name = "UformularioEncuenta.findById", query = "SELECT u FROM UformularioEncuenta u WHERE u.id = :id")
    , @NamedQuery(name = "UformularioEncuenta.findByNumeroDocumento", query = "SELECT u FROM UformularioEncuenta u WHERE u.numeroDocumento = :numeroDocumento")
    , @NamedQuery(name = "UformularioEncuenta.findByEmail", query = "SELECT u FROM UformularioEncuenta u WHERE u.email = :email")
    , @NamedQuery(name = "UformularioEncuenta.findByComentario", query = "SELECT u FROM UformularioEncuenta u WHERE u.comentario = :comentario")
    , @NamedQuery(name = "UformularioEncuenta.findByFechaRespuesta", query = "SELECT u FROM UformularioEncuenta u WHERE u.fechaRespuesta = :fechaRespuesta")})
public class UformularioEncuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_FORMULARIO")
    @SequenceGenerator(name = "SEQ_FORMULARIO", sequenceName = "UFORMULARIO_ENCUENTA_SEQ", allocationSize = 1)
    private BigDecimal id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NUMERO_DOCUMENTO")
    private String numeroDocumento;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "COMENTARIO")
    private String comentario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_RESPUESTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRespuesta;
    @JoinColumn(name = "MARCA_PC_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private UmarcaPc marcaPcFk;

    public UformularioEncuenta() {
    }

    public UformularioEncuenta(BigDecimal id) {
        this.id = id;
    }

    public UformularioEncuenta(BigDecimal id, String numeroDocumento, String email, String comentario, Date fechaRespuesta) {
        this.id = id;
        this.numeroDocumento = numeroDocumento;
        this.email = email;
        this.comentario = comentario;
        this.fechaRespuesta = fechaRespuesta;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaRespuesta() {
        return fechaRespuesta;
    }

    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public UmarcaPc getMarcaPcFk() {
        return marcaPcFk;
    }

    public void setMarcaPcFk(UmarcaPc marcaPcFk) {
        this.marcaPcFk = marcaPcFk;
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
        if (!(object instanceof UformularioEncuenta)) {
            return false;
        }
        UformularioEncuenta other = (UformularioEncuenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.superintendencia.entidad.UformularioEncuenta[ id=" + id + " ]";
    }
    
}
