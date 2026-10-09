package Modelos;

public class ProductoIndumentaria extends Producto {

    private String talle;
    private String material;


    public String getTalle() {
        return talle;
    }


    public void setTalle(String talle) {
        this.talle = talle;
    }


    public String getMaterial() {
        return material;
    }


    public void setMaterial(String material) {
        this.material = material;
    }


    public ProductoIndumentaria(String tipo, String modelo, double precio, String talle, String material, Categoria categoria) {
        super(tipo, modelo, precio, categoria);
        this.talle = talle;
        this.material = material;
    }
}
