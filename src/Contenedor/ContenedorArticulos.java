package Contenedor;
import Modelos.Producto;
import java.util.ArrayList;

public class ContenedorArticulos {

   // registrar, consultar, modificar, listar y eliminar artículos


   private ArrayList<Producto> productos;

    public ContenedorArticulos(ArrayList<Producto> productos) {
        
    }

    //LISTAR PRODUCTOS 
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> copiaProductos = new ArrayList<>();
        return copiaProductos;
    }

    //Mostrar 1 articulo por id

    public Producto getProductoPorId(int id) {
        if (id >= 0 && id < productos.size()) {
          
          
            return productos.get(id);
        } 
        // else si es null 
        //me autocorrige con index: )?
        return productos.get(0);
    }



    //AGREGAR PRODUCTOS
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    //ELIMINAR PRODUCTOS
    public boolean eliminarProductoPorId(int id) {
        if (id >= 0 && id < productos.size()) {
            productos.remove(id);
            return true;
        } else {
         return false;
        }
    }
    
    

    public boolean modificarProductoPorId(int id, Producto nuevoProducto) {
        if (id >= 0 && id < productos.size()) {
           Producto productoExistente = productos.get(id);
            productoExistente.setTipo(nuevoProducto.getTipo());
            productoExistente.setModelo(nuevoProducto.getModelo());
            productoExistente.setPrecio(nuevoProducto.getPrecio());
            productoExistente.setCategoria(nuevoProducto.getCategoria());
        return true; // mostrar mensaje valido      
        }
        else 
        {
            return false; //mostrar mensaje 
        }
    }




}
