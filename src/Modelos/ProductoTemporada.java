package Modelos;

public class ProductoTemporada extends Producto{


    private String tipoTemporada;

    public String getTipoTemporada() {
        return tipoTemporada;
    }

    public void setTipoTemporada(String tipoTemporada) {
        this.tipoTemporada = tipoTemporada;
    }

    public ProductoTemporada(String tipo, String modelo, double precio, String tipoTemporada, Categoria categoria) {
        super(tipo, modelo, precio, categoria);
        this.tipoTemporada = tipoTemporada;
    }


    
}
