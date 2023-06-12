package app;

import control.ClientesDAO07;
import control.CorreosDAO07;
import entidades.Clientes06;
import entidades.Correos06;
import java.util.List;
import java.util.Scanner;

public class AppVista08 {
    private static List l = null;
    private static CorreosDAO07 correosDAO=null;
    private static ClientesDAO07 clienteDAO=null;
    
    private static Correos06 correo=null;
    private static Clientes06 cliente=null;
    
    public AppVista08() {
        super();
    }

    public static void main(String[] args) {
        AppVista08 appVista08 = new AppVista08();
        clienteDAO = new ClientesDAO07();
        correosDAO = new CorreosDAO07();
        
        int teclaNum = 0;
        Scanner miTeclado = new Scanner(System.in);
        
        do {
          System.out.print("[1]Alta cliente [2]Listar Clientes [3]Salir ==> ");  
          teclaNum = miTeclado.nextInt();
            switch(teclaNum) {
            case 1: altaCliente(); break;
            case 2: listarClientes(); break;
            case 3: break;  
            default: break;
            }
        }while(teclaNum != 3);
        System.out.println("El programa ha terminado normalmente");       
    }
    private static void altaCliente() {
        String teclasStr = "";
        Scanner miTeclado = new Scanner(System.in);
        try {
          System.out.print("Escribir el DNI del Cliente ==> ");  
          teclasStr = miTeclado.nextLine();
          String dni = teclasStr;
          System.out.print("Escribir el nombre del Cliente ==> ");  
          teclasStr = miTeclado.nextLine();
          String nombre = teclasStr;
          System.out.print("Escribir el apellido del Cliente ==> ");
          teclasStr = miTeclado.nextLine();
          String apellido = teclasStr;
          cliente = new Clientes06(dni, nombre, apellido);
          clienteDAO.guardar(cliente);
        }catch(Exception err){
            System.out.println("Error de entrada de teclado o alta cliente " + err.getMessage());
        }
    }
    private static void listarClientes() {
        //l = clienteDAO.listarClientes();
        l = clienteDAO.listarTodo();
        System.out.println(l);
        int teclaNum = 0;
        Scanner miTeclado = new Scanner(System.in);
        do {
            System.out.print("[1]Alta Correo [2]Listar Correos [3]Salir ==> ");  
            teclaNum = miTeclado.nextInt();
            switch(teclaNum) {
              case 1: altaCorreo(); break;
              case 2: listarCorreos(); break;
              case 3: break;  
              default: break;
          }
        }while(teclaNum != 3);
    }
    
    private static void altaCorreo() {
            String teclasStr = "";
            Scanner miTeclado = new Scanner(System.in);
            try {
              System.out.print("Escribir el DNI del Cliente ==> ");  
              teclasStr = miTeclado.nextLine();
              String dni = teclasStr;
              System.out.print("Escribir el queCorreo del Cliente ==> ");  
              teclasStr = miTeclado.nextLine();
              String queCorreo = teclasStr;
              cliente = new Clientes06(dni, "", "");
              correo = new Correos06(queCorreo, cliente);
              correosDAO.guardar(correo);
            }catch(Exception err){
                System.out.println("Error de entrada de teclado o alta cliente " + err.getMessage());
            }
        }
    
    private static void listarCorreos() {
        String teclasStr = "";
        Scanner miTeclado = new Scanner(System.in);
        System.out.print("Escribir el DNI del Cliente ==> ");
        teclasStr = miTeclado.nextLine();
        String algunDNICliente = teclasStr;
        l = correosDAO.listarCorreos(algunDNICliente);
        System.out.println(l);
    }
}
