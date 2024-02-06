
import clases.Productos;
import java.util.Scanner;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        int salida= 0;
        ArrayList<Productos> listadoProductos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        listadoProductos.add(new Productos( "pan ",  300));

        
        do {

            System.out.println("menu de productos");
            System.out.println("ingrese 1, para registrar producto");
            System.out.println("ingrese 2, para asignar cantidad a un producto");
            System.out.println("ingrese 3, para ver todos los productos");
            System.out.println("ingrese 4, para vender un producto");
            System.out.println("ingrese 5, para terminar el programa");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                System.out.println("ingrese el nombre del producto a  registrar: ");
                String nombre = entrada.nextLine();
                entrada.nextLine();

                System.out.println("ingrese la cantidad del producto a registrar: ");
                int precio = entrada.nextInt();
                entrada.nextLine();
    
                listadoProductos.add(new Productos( nombre,  precio));
    
                System.out.println("se registro el producto");
                    break;

                case 2:
                System.out.println("ingrese el nombre del producto a modificar la cantidad: ");
                String buscarNombre = entrada.nextLine();
                entrada.nextLine();
                
                for(int i = 0; i < listadoProductos.size(); i++){
                    if(listadoProductos.get(i).getNombre().equalsIgnoreCase(buscarNombre)){
                        System.out.println("cantidad actual " + listadoProductos.get(i).getNombre());
                        System.out.println("ingrese la nueva cantidad: ");
                        int nuevaCantidad = entrada.nextInt();
                        entrada.nextLine();

                        listadoProductos.get(i).setCantidad(nuevaCantidad);
                        System.out.println("cantidad actualizada correctamente");
                        break;
                    }else{
                        System.out.println("el producto no existe en nuestros registros");
                    }
                 }

                    break;
                case 3:
                System.out.println("estos son todos los productos");
                System.out.println("existen un total de: "+listadoProductos.size()+ " productos totales");
                for(Productos productos : listadoProductos){
                    System.out.println("nombre: " +productos.getNombre() + " cantidad: "
                     + productos.getCantidad() + " precio: " + productos.getPrecio());
                }
                    break;
                case 4:
                System.out.println("ingrese el nombre del producto a vender");
                String nombreProducto=entrada.nextLine();
                entrada.nextLine();
    
                for (Productos productos : listadoProductos) {
                    if (productos.getNombre().equalsIgnoreCase(nombreProducto)) {
                        System.out.println("ingrese la cantida del producto a vender");
                        int cantidad=entrada.nextInt();
                        entrada.nextLine();
                        productos.vender(cantidad); 
                    }else{
                        System.out.println("no se encontró el producto que desea vender");
                    }
                }
                    break;
                case 5:
                System.out.println("se cerro el programa");
                salida=1;
                    break;
            
                default:
                    System.out.println("esta option no es valida");
                    break;
            }

         
        } while (salida == 0);

        entrada.close();
    }
}

