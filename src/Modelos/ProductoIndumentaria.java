package Modelos;

public class ProductoIndumentaria extends Producto {

    private String talle;
    private String material;


    public ProductoIndumentaria(String tipo, String modelo, double precio, String talle, String material) {
        super(tipo, modelo, precio );
        this.talle = talle;
        this.material = material;
    }
}
