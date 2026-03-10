
package cafeteriaapp;
import java.util.ArrayList;
import java.util.Scanner;

public class CafeteriaApp {    
    public static void main(String[] args) {
        Scanner ingresarDatos = new Scanner(System.in);                
        int opcion = 0;
        
        do{
        mostrarMenuPrincipal();
        opcion = ingresarDatos.nextInt();        
        switch (opcion) {
           case 1:
               Inventario.mostrarProductos();
                break;
           case 2:               
                break;
           case 3:
                break;  
           case 4:
                break;
           case 5:
               Inventario.crearProductos();
                break; 
           case 6:      
                   System.out.println("Ha salido del sistema");
               break;
           default:
               System.out.println("Opcion Invalida, Intentalo de nuevo.");
               break;        
        }        
        }while(opcion != 6);        
    

    }
    
    public static void mostrarMenuPrincipal(){        
        System.out.println("=======MENÚ CAFETERIA=======");
        System.out.println("Opción 1: Ver Menú de Productos");
        System.out.println("Opción 2: Crear Pedidos(AgregarProductos)");
        System.out.println("Opción 3: Cobro de Pedidos");
        System.out.println("Opción 4: Reporte del día");
        System.out.println("Opción 5: Inventario");
        System.out.println("Opción 6: Salir del Sistema.");
        System.out.println("Elige una opción ");
    }
}

 