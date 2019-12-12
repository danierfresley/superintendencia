package co.com.superintendencia.entidad;

import co.com.superintendencia.entidad.UmarcaPc;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-11T20:23:50")
@StaticMetamodel(UformularioEncuenta.class)
public class UformularioEncuenta_ { 

    public static volatile SingularAttribute<UformularioEncuenta, BigDecimal> id;
    public static volatile SingularAttribute<UformularioEncuenta, String> numeroDocumento;
    public static volatile SingularAttribute<UformularioEncuenta, String> comentario;
    public static volatile SingularAttribute<UformularioEncuenta, UmarcaPc> marcaPcFk;
    public static volatile SingularAttribute<UformularioEncuenta, String> email;
    public static volatile SingularAttribute<UformularioEncuenta, Date> fechaRespuesta;

}