package clases;

/**
 * Productos
 */
public class Productos {
        String nombre;
        int precio;
        int cantidad;
        static int count_productos;

       public Productos(String nombre, int precio){
            this.nombre = nombre;
            this.precio=precio;
            this.cantidad=0;
            count_productos++;
        }

        //metodos de acesso 
        public void setNombre(String nombre){
            this.nombre=nombre;
        }
        public String getNombre(){
            return this.nombre;
        }
        public void setCantidad(int cantidad){
            this.cantidad=cantidad;
        }
        public int  getCantidad() {
            return this.cantidad;
        }
        public void setPrecio(int precio) {
            this.precio=precio;
        }
        public  int getPrecio() {
            return this.precio;
        }
        public static int getCountProductos() {
            return count_productos;
        }

        //metodos de la clase

        public void agregarCantidad(int cantidad){
            this.cantidad+=cantidad;
        }

        public void vender(int cantidad){
            if (this.cantidad >= cantidad){
                this.cantidad -= cantidad ;
            }else{
                System.out.println("ingrese una cantidad mayor  o igual al stock");
                }
            }

            public void mostrarInf(){
                System.out.println("el producto "+this.getNombre()+" tiene un precio de: $"+this.getPrecio());
                System.out.println("y en el inventario hay "+this.getCantidad()+ "unidades disponibles.");
                System.out.println("actualmente existen un total de " + getCountProductos()+" productos registrados.");

            }
        }


    
