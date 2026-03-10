
package cafeteriaapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
        static  ArrayList<Producto> listaDeProductos = new ArrayList<>();

    public Inventario() {
        
    }      
    
    public static void crearProductos(){               
            Scanner ingresarDatos = new Scanner(System.in);              
            int opcionListaProductos = 0;                    
            do{
            mostrarMenuInventario();
            opcionListaProductos = ingresarDatos.nextInt();                   
            ingresarDatos.nextLine();

                switch (opcionListaProductos){
                    case 1:                    
                        nuevoProducto();
                        break;
                    case 2:  
                        reabastecerProductos();
                        break;                       
                    case 3:
                       actualizarStockProducto();
                        break;
                    case 4:
                        actualizarPrecioProducto();
                        break;
                    case -1:
                         System.out.println("Ha Salido de la Opción Agregar Producto");
                        break;
                    default:
                        System.out.println("Opción no valida. Ingresa Una Opcion Diferente.");
                        break;
               }
           }while(opcionListaProductos != -1);                
    }
    
  
    public static void mostrarMenuInventario (){        
            System.out.println("Opción  1: Ingresar un Nuevo Producto");
            System.out.println("Opción  2: Reabastecer Producto");
            System.out.println("Opción  3: Actualizar Stock del producto");
            System.out.println("Opción  4: Actualizar Precio del Prodducto");
            System.out.println("Opción -1: Salir ");    
    }
    
    
    public static void nuevoProducto(){
        Scanner ingresarDatos = new Scanner(System.in);   
        String codigoProducto;
        String nombreProducto;
        double precioProducto;
        int cantidadProducto;
        int stockProducto;               

        System.out.println("Ingresa el Código del Producto: ");
        codigoProducto = ingresarDatos.nextLine();
        System.out.println("Ingresa el Nombre del Producto: ");
        nombreProducto = ingresarDatos.nextLine();
        System.out.println("Ingresa el Precio del Producto: ");
        precioProducto = ingresarDatos.nextDouble();
        System.out.println("Ingresa la cantidad del Producto: ");
        cantidadProducto = ingresarDatos.nextInt();
        System.out.println("Ingresa el Stock del Producto: ");
        stockProducto = ingresarDatos.nextInt();  

        Producto producto = new Producto(codigoProducto,  nombreProducto, precioProducto, cantidadProducto, stockProducto);
        listaDeProductos.add(producto);         
    }

    
    public static void reabastecerProductos(){       
        Scanner ingresarDatos = new Scanner(System.in);  
        String codigoProducto;
        int cantidad ;
        boolean codigoEncontrado = false;
        
        System.out.println("Ingresa el Código del Producto: ");
        codigoProducto = ingresarDatos.nextLine();                           
        for (Producto p: listaDeProductos){                            
                 if (p.getCodigoProducto().equals(codigoProducto)){
                    System.out.println("Nombre del producto: " + p.getNombreProducto());
                    System.out.println("Ingresa la cantidad del producto");
                    cantidad = ingresarDatos.nextInt();
                    p.setCantidadProducto(p.getCantidadProducto() + cantidad);          
                    codigoEncontrado = true;
                 }                             
        }                        
        if (! codigoEncontrado){
            System.out.println("Producto no Encontrado.");
            return;
        }                         
    }
    
    
    public static void actualizarStockProducto(){
         Scanner ingresarDatos = new Scanner(System.in);  
         int stock;
         String codigoProducto ;
        boolean stockEncontrado = false;
        
        System.out.println("Ingresa el Código del Producto: ");
        codigoProducto = ingresarDatos.nextLine();                           
        for (Producto p: listaDeProductos){                            
                 if (p.getCodigoProducto().equals(codigoProducto)){
                    System.out.println("Nombre del producto: " + p.getNombreProducto());
                    System.out.println("Ingresa la Cantidad de Stock a Actualizar");
                    stock = ingresarDatos.nextInt();
                    p.setCantidadProducto(stock);          
                    stockEncontrado = true;
                 }                             
        }                        
        if (! stockEncontrado){
            System.out.println("Producto no Encontrado.");
            return;
        }
    }
    
    
    public static void actualizarPrecioProducto(){
        Scanner ingresarDatos = new Scanner(System.in);  
        String codigoProducto ;
        double precio;
        boolean precioEncontrado = false;
        
        System.out.println("Ingresa el Código del Producto: ");
        codigoProducto = ingresarDatos.nextLine();                           
        for (Producto p: listaDeProductos){                            
                 if (p.getCodigoProducto().equals(codigoProducto)){
                    System.out.println("Nombre del producto: " + p.getNombreProducto());
                    System.out.println("Ingresa el Nuevo Precio a Actualizar");
                    precio = ingresarDatos.nextDouble();
                    p.setPrecioProducto(precio);          
                    precioEncontrado = true;
                 }                             
        }                        
        if (! precioEncontrado){
            System.out.println("Producto no Encontrado.");
            return;
        }
    }

    
    public static void mostrarProductos(){
          for (Producto p: listaDeProductos){
              System.out.printf("Codigo del producto: %-5s  |  ", p.getCodigoProducto());
              System.out.printf("Nombre: %-15s  |  " , p.getNombreProducto());
              System.out.printf("Precio: %-8.2f  |  ", p.getPrecioProducto());
              System.out.printf("Cantidad: %-5d  |  " , p.getCantidadProducto());
              System.out.printf("Stock: %-5d%n" , p.getStockProducto());              
        }
    }       
      
}


    
