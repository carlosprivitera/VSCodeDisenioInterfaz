package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "correo")
public class Correos06 {
    public Correos06() {
        super();
    }
    
    @Id
    @Column(name = "idCorreo", length = 6)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCorreo;
    @Column(name = "correo", length = 100, unique=true, nullable=false)
    private String correo;
    
    
    @ManyToOne(fetch = FetchType.LAZY) //Un cliente muchos correos
    private Clientes06 clientes06=null;     //Se crea un objeto tipo Cliente06{}

    public Correos06(String correo, Clientes06 clientes06) {
        super();
        this.correo = correo;
        this.clientes06 = clientes06; //El cliente relacionado con este correo
    }

    public void setIdCorreo(int idCorreo) {
        this.idCorreo = idCorreo;
    }

    public int getIdCorreo() {
        return idCorreo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setClientes06(Clientes06 clientes06) {
        this.clientes06 = clientes06;
    }

    public Clientes06 getClientes06() {
        return clientes06;
    }

    @Override
    public String toString() {
        // TODO Implement this method
        return "id=" + idCorreo + ", Correo=" + correo + "\n";
    }
}

/**
 * 
 * clase llamada "Correos06" que representa una entidad de correo electrónico en un sistema de gestión de correos. A continuación, te explicaré las diferentes partes del código:

Anotaciones de JPA:

@Entity: Esta anotación indica que la clase "Correos06" es una entidad que se mapea a una tabla en la base de datos.
@Table: Esta anotación se utiliza para especificar el nombre de la tabla en la base de datos a la cual se va a mapear la entidad. En este caso, la entidad "Correos06" se mapeará a la tabla "correo".
@Id: Esta anotación indica que el atributo "idCorreo" es la clave primaria de la entidad.
@Column: Estas anotaciones se utilizan para especificar los atributos de columna de la tabla en la base de datos. Se utilizan para definir el nombre de la columna, la longitud, si es único, nullable, entre otras propiedades.
Atributos de la clase:

private int idCorreo: Es el atributo que representa el identificador del correo electrónico. Se mapea a la columna "idCorreo" en la tabla de la base de datos.
private String correo: Es el atributo que representa la dirección de correo electrónico. Se mapea a la columna "correo" en la tabla de la base de datos.
private Clientes06 clientes06: Es un objeto de la clase "Clientes06" que representa el cliente asociado a este correo electrónico. Se establece una relación de muchos a uno (ManyToOne) con la anotación @ManyToOne. Se utiliza la anotación @FetchType.LAZY para indicar que la recuperación de los datos del cliente se realiza de forma diferida (perezosa) cuando sea necesario.
Constructores:

public Correos06(): Es el constructor predeterminado de la clase.
public Correos06(String correo, Clientes06 clientes06): Es un constructor que recibe el correo electrónico y el objeto "Clientes06" asociado.
Métodos getter y setter: Se utilizan para acceder y modificar los atributos de la clase.

Método toString(): Este método devuelve una representación en forma de cadena de texto de la entidad "Correos06".

En resumen, la clase "Correos06" representa un correo electrónico con atributos como el identificador, la dirección de correo y la relación con un cliente asociado. Está mapeada como una entidad JPA y puede utilizarse en conjunto con Spring y JPA para realizar operaciones de persistencia en una base de datos.
 * 
 */
