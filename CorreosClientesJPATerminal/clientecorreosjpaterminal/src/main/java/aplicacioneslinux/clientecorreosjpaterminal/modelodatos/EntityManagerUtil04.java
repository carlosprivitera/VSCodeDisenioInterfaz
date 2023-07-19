/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacioneslinux.clientecorreosjpaterminal.modelodatos;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class EntityManagerUtil04 {
    public EntityManagerUtil04() {
        super();
    }
    private static EntityManager manager = null;
    private static Map<String, Object> properties = new HashMap<>();

    public static Map<String, Object> getProperties() {
        return properties;
    }

    public static EntityManager getEntityManager() {
        try {
          if(manager==null) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("DBCliente_Desarrollo", properties);
            properties = factory.getProperties();
            manager = factory.createEntityManager();
          }
        }catch(PersistenceException er) {
            System.out.println("\n\n *-*-*-*- Error de persistencia: " + er.getMessage() + "\n\n");
            System.exit(21);
        }catch(Exception er) {  
            System.out.println("\n\n *+*+*+*+ Error de persistencia: " + er.getMessage() + "\n\n");
            System.exit(22);
        }
        return manager;
    }

    public static void main(String[] args) {
        EntityManager manager2 = EntityManagerUtil04.getEntityManager();
        System.out.println("\n ***** Se ha creado un objeto EntityManager ==> " + manager2.getClass().getCanonicalName() + "\n");
        ////////////////////////////////
        System.out.println("\n+++ Imprimiendo persistense.xml++++++ \n");
        properties.forEach((key, value) -> System.out.println(key + " ===> " + value));
        System.out.println("\n+++ Fin impresión persistense.xml++++++\n");
        //manager2.close();
        ///////////////////////////////
    }
}
