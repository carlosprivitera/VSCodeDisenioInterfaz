package aplicacioneslinux.clientecorreosjpaterminal.modelodatos;

/**
 *
 * @author carlos
 */
import java.util.List;

public interface DAOGRUD03<T> { 
    //Métodos abstractos GRUD create, read, update, delete
    void guardar(T t);   //Create  //Crear
    List<T> listarTodo();//Read    //Leer
    void editar(T t);    //Update  //Actualizar
    void borrar(T t);    //Delete  //Borrar
    
    ///////////////////////////////////////
    //Otros métodos relacionados con los requerimientos del sistema o reglas de negocios
    //void unRegistro(T t);
    //void buscar(T t);    
    ///////////////////////////////////////
}
