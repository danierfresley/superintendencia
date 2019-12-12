package co.com.superintendencia.entidad;

import co.com.superintendencia.entidad.UformularioEncuenta;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-11T20:23:50")
@StaticMetamodel(UmarcaPc.class)
public class UmarcaPc_ { 

    public static volatile SingularAttribute<UmarcaPc, String> descripcion;
    public static volatile ListAttribute<UmarcaPc, UformularioEncuenta> uformularioEncuentaList;
    public static volatile SingularAttribute<UmarcaPc, BigDecimal> id;

}