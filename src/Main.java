import java.util.ArrayList;
import Contenedor.ContenedorArticulos;
import Modelos.Categoria;
import Modelos.Producto;
import Util.Scanneador;


// El sistema deberá permitir registrar, consultar, modificar, listar y eliminar artículos, utilizando
// ArrayList para almacenar la información.


public class Main {
    public static void main(String[] args)  {

    ArrayList<Producto> productos = new ArrayList<>();
   
    ContenedorArticulos contenedor = new ContenedorArticulos(productos);



    Scanneador scanner = new Scanneador();
    int opcion = 0;

    //menu 
  do  {

    //opciones 
    System.out.println("Bienvenido al sistema de gestión de productos. Por favor, seleccione una opción:\n" +
            "1. Agregar un producto\n" +
            "2. Mostrar todos los productos\n" +
            "3. Mostrar un producto por ID\n" +
            "4. Modificar un producto\n" +
            "5. Eliminar un producto\n" +
            "0. Salir");
        
    opcion = scanner.getSint();
    switch (opcion) {
        case 1: {
            // Agregar un producto
            System.out.println("Ingrese el tipo de producto:");
            String tipo= scanner.getSstring();

    
            System.out.println("Ingrese el modelo del producto:");
            String modelo = scanner.getSstring();

            System.out.println("Ingrese el precio del producto:");
            double precio = scanner.getSdouble();

            System.out.println("Ingrese el código de la categoría del producto:(int)");
            int codigoCategoria = scanner.getSint();

            System.out.println("Ingrese el nombre de la categoría del producto:");
            String nombreCategoria = scanner.getSstring();
            
            System.out.println("Ingrese la descripción de la categoría del producto:");
            String descripcionCategoria = scanner.getSstring();

            Categoria categoria = new Categoria(codigoCategoria, nombreCategoria, descripcionCategoria);
            Producto nuevoProducto = new Producto(tipo, modelo, precio, categoria);
            //agregar si es de tipo ProductoIndumentaria o ProductoTemporada

            contenedor.agregarProducto(nuevoProducto);
            System.out.println("Se agrego un producto correctamente");
            //agregar si fallo 
            }
            break;

            case 2:{
            // Mostrar todos los productos
            ArrayList<Producto> productosLista = contenedor.getProductos();
            int i =0 ;
                for (Producto producto : productosLista) {
                    System.out.println(i + ". " + producto.toString());
                    i++;
                }
            }
            break;

            case 3: {
            // Mostrar un producto por ID
            System.out.println("Ingrese el ID del producto que desea mostrar// si no existe muestra el primero");
            int idProdutoBuscar = scanner.getSint();
            System.out.println(contenedor.getProductoPorId(idProdutoBuscar));
          
            //agragar si no encontró 

            break;
            }
            case 4:{
            // Modificar un producto
            System.out.println("Ingrese el ID del producto que desea modificar:");
            int idProductoModificar = scanner.getSint();  
            
            //ingresar nuevos datos 

            System.out.println("Ingrese el tipo de producto:");
            String tipoProducto = scanner.getSstring();
    
            System.out.println("Ingrese el modelo del producto:");
            String modeloNuevo = scanner.getSstring();

            System.out.println("Ingrese el precio del producto:");
            double precioNuevo = scanner.getSdouble();

             //APARTADO DE CATEGORIA 
            System.out.println("Ingrese el código de la categoría del producto:");
             int codigoCatNueva = scanner.getSint();

            System.out.println("Ingrese el nombre de la categoría del producto:");
           String nombreCatNueva = scanner.getSstring();;
            
            System.out.println("Ingrese la descripción de la categoría del producto:");
             String descripcionCatNueva = scanner.getSstring();

            Categoria categoria1 = new Categoria(codigoCatNueva, nombreCatNueva, descripcionCatNueva);
            Producto productoNuevo = new Producto(tipoProducto, modeloNuevo, precioNuevo, categoria1);

                if (contenedor.modificarProductoPorId(idProductoModificar, productoNuevo)) {
                    System.out.println("Se modificó el producto correctamente");
                } else {
                    System.out.println("No existe producto con ese ID");
                }
                break;
                    
            }
         
            // Eliminar un producto
            //agregar try 
            case 5:{
            
            System.out.println("Ingrese el ID del producto que desea eliminar:");
            int idProductoEliminar = scanner.getSint();
            if(idProductoEliminar  < contenedor.getProductos().size()){
                System.out.println("Va a eliminar producto" + contenedor.getProductoPorId(idProductoEliminar));
               
            }
            

            //agregar si acepta o no que se elimine 
            if( contenedor.eliminarProductoPorId(idProductoEliminar)){
                
                System.out.println("Se elimino un producto correctamente");
            }
            else {
                System.out.println("No existe producto con ese ID");
            }
            break;
            }   
            case 0:{
            System.out.println("Saliendo del sistema");

            opcion = 0;
            break;
            }
            default:
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");



          }
    
    }while (opcion != 0);

    }
}
