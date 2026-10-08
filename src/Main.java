import java.util.ArrayList;
import Modelos.Producto;
import Util.ScanTer;





public class Main {
    public static void main(String[] args)  {

    ArrayList<Producto> productos = new ArrayList<>();

    ScanTer scanner = new ScanTer();

    //menu 

    System.out.println("Bienvenido al sistema de gestión de productos. Por favor, seleccione una opción:\n" +
            "1. Agregar un producto\n" +
            "2. Mostrar todos los productos\n" +
            "3. Salir");


    int opcion = scanner.getSint();




    }
}
