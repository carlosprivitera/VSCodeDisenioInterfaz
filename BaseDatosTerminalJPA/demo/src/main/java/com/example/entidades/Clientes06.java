package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente" )
public class Clientes06 {
    
    public Clientes06() {
        super();
    }

    public Clientes06(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Column(name="DNI", length = 10, nullable=false)
    @Id
    private String dni;
    @Column(name="Nombre", length = 100)
    private String nombre;
    @Column(name="Apellido", length = 100)
    private String apellido;


    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        // TODO Implement this method
        return "id=" + dni + ", Nombre=" + nombre + ", " + apellido + "\n";
    }
}

/**
 * 
 * ¡Correcto! La entidad "Clientes06" que has proporcionado contiene elementos relacionados con Spring, Spring Boot y JPA. Aquí tienes una descripción de cada uno de ellos:

@Entity: Esta anotación pertenece a JPA y se utiliza para indicar que la clase "Clientes06" es una entidad que se mapea a una tabla en la base de datos. Es una parte fundamental de JPA y permite que la clase se gestione y persista en la base de datos.

@Table: Esta anotación también pertenece a JPA y se utiliza para especificar el nombre de la tabla en la base de datos a la cual se va a mapear la entidad. En este caso, la entidad "Clientes06" se mapeará a la tabla "cliente".

@Column: Esta anotación de JPA se utiliza para especificar los atributos de columna de la tabla en la base de datos. Se puede utilizar para definir el nombre de la columna, la longitud, si es nullable, entre otras propiedades. En el caso de la entidad "Clientes06", se utilizan las anotaciones @Column para los atributos "dni", "nombre" y "apellido".

Además de las anotaciones relacionadas con JPA, la entidad "Clientes06" es una clase simple de POJO (Plain Old Java Object) que se utiliza para representar un objeto de cliente. No contiene elementos específicos de Spring o Spring Boot, ya que es independiente del framework. Sin embargo, esta entidad se puede utilizar dentro de una aplicación Spring o Spring Boot junto con JPA para realizar operaciones de persistencia de datos.
 * 
 */
