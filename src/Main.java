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
    int opcion = scanner.getSint();

    //menu 
   while (opcion != 0) {

    //opciones 
    System.out.println("Bienvenido al sistema de gestión de productos. Por favor, seleccione una opción:\n" +
            "1. Agregar un producto\n" +
            "2. Mostrar todos los productos\n" +
            "3. Mostrar un producto por ID\n" +
            "4. Modificar un producto\n" +
            "5. Eliminar un producto\n" +
            "0. Salir");

    switch (opcion) {
        case 1: 
            // Agregar un producto
            System.out.println("Ingrese el tipo de producto:");
            String tipo= scanner.getSstring();

    
            System.out.println("Ingrese el modelo del producto:");
            String modelo = scanner.getSstring();

            System.out.println("Ingrese el precio del producto:");
            double precio = scanner.getSdouble();

            System.out.println("Ingrese el código de la categoría del producto:");
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
            
            break;

            case 2:
            // Mostrar todos los productos
            ArrayList<Producto> productosLista = contenedor.getProductos();
            for (Producto producto : productosLista) {
                System.out.println(producto);
            }
            break;

            case 3:
            // Mostrar un producto por ID
            System.out.println("Ingrese el ID del producto que desea mostrar:");
            int idProdutoBuscar = scanner.getSint();
            System.out.println(contenedor.getProductoPorId(idProdutoBuscar));
          
            //agragar si no encontró 

            break;
            case 4:
            // Modificar un producto
            System.out.println("Ingrese el ID del producto que desea modificar:");
            int idProductoModificar = scanner.getSint();  
            Producto productoBuscadoProducto1 = contenedor.getProductoPorId(idProductoModificar);

            //ingresar nuevos datos 


             System.out.println("Ingrese el tipo de producto:");
            productoBuscadoProducto1.setTipo(scanner.getSstring());

            System.out.println("Ingrese el modelo del producto:");
             productoBuscadoProducto1.setModelo(scanner.getSstring());

             
            System.out.println("Ingrese el precio del producto:");
             productoBuscadoProducto1.setPrecio(scanner.getSdouble());


             //APARTADO DE CATEGORIA 
            System.out.println("Ingrese el código de la categoría del producto:");
            int codigoCategoria1 = scanner.getSint();

            System.out.println("Ingrese el nombre de la categoría del producto:");
            String nombreCategoria1 = scanner.getSstring();
            
            System.out.println("Ingrese la descripción de la categoría del producto:");
            String descripcionCategoria1 = scanner.getSstring();

            Categoria categoria1 = new Categoria(codigoCategoria1, nombreCategoria1, descripcionCategoria1);
            productoBuscadoProducto1.setCategoria(categoria1);


            //agregar si es de tipo ProductoIndumentaria o ProductoTemporada

            System.out.println("Se agrego un producto correctamente");

            contenedor.modificarProductoPorId(idProductoModificar, productoBuscadoProducto1);
            break;

            // Eliminar un producto
            case 5:
            
            System.out.println("Ingrese el ID del producto que desea eliminar:");
            int idProductoEliminar = scanner.getSint();
            System.out.println("Va a eliminar producto" + contenedor.getProductoPorId(idProductoEliminar)    );

            //agregar si acepta o no que se elimine 
            if( contenedor.eliminarProductoPorId(idProductoEliminar)){
                
                System.out.println("Se elimino un producto correctamente");
            }
            else {
                System.out.println("No existe producto con ese ID");
            }
            break;

            default:
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");



          }
    
        }

    }
}
