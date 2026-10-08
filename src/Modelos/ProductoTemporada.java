package Modelos;

public class ProductoTemporada extends Producto{


    public String tipoTemporada;

    public ProductoTemporada(String tipo, String modelo, double precio, String talle, String material,
            String tipoTemporada) {
        super(tipo, modelo, precio, talle, material);
        this.tipoTemporada = tipoTemporada;
    }

}
