
package cafeteriaapp;
import java.util.ArrayList;
import java.util.Scanner;

public class CafeteriaApp {
    static  ArrayList<Producto> listaDeProductos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner ingresarDatos = new Scanner(System.in);                
        int opcion = 0;
        
        do{
        mostrarMenuPrincipal();
        opcion = ingresarDatos.nextInt();        
        switch (opcion) {
           case 1:
               mostrarProductos(listaDeProductos);
                break;
           case 2:
               crearProductos();
                break;
           case 3:
                break;  
           case 4:
                break;
           case 5:
                break; 
           case 6:
               break;
           default:
               System.out.println("Opcion Invalida, Intentalo de nuevo.");
               break;        
        }
        
        }while(opcion != 6);        
        System.out.println("Ha salido del sistema");

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
    
    public static void crearProductos(){
        Scanner ingresarDatos = new Scanner(System.in);
              
        int opcionListaProductos = 0;        
        do{
            System.out.println("Opcion 1: Ingresar un Nuevo Producto");
            System.out.println("Opción -1: Salir ");
            opcionListaProductos = ingresarDatos.nextInt();                   
            ingresarDatos.nextLine();

                if (opcionListaProductos ==1){                
                    String codigoProducto;
                    String nombreProducto;
                    double precioProducto;
                    int stockProducto;               

                    System.out.println("Ingresa el Código del Producto: ");
                    codigoProducto = ingresarDatos.nextLine();
                    System.out.println("Ingresa el Nombre del Producto: ");
                    nombreProducto = ingresarDatos.nextLine();
                    System.out.println("Ingresa el Precio del Producto: ");
                    precioProducto = ingresarDatos.nextDouble();
                    System.out.println("Ingresa el Stock del Producto: ");
                    stockProducto = ingresarDatos.nextInt();  

                    Producto Productos = new Producto(codigoProducto,  nombreProducto, precioProducto, stockProducto);
                    listaDeProductos.add(Productos);                 
               }else if (opcionListaProductos == -1){
                    System.out.println("Ha Salido de la Opción Agregar Producto");
                    break;
                }else  {
                    System.out.println("Opcion Invalida, Intenta de Nuevo.");
                }                
           }while(opcionListaProductos != -1);                
    }
    
    public static void mostrarProductos(ArrayList<Producto> listaDeProductos){
          for (Producto p: listaDeProductos){
              System.out.print("Codigo del producto: " + p.getCodigoProducto());
              System.out.print(" | Nombre del prodcuto: " + p.getNombreProducto());
              System.out.print(" | Precio del Producto: " + p.getPrecioProducto());
              System.out.println(" | Stock del Producto: " + p.getStockProducto());              
        }
    }   
      
}

 