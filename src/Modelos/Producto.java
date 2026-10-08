package Modelos;

public class Producto {
    private String tipo;
    private String modelo;
    private double precio;
    private Categoria categoria;

        public Producto(String tipo, String modelo, double precio, Categoria categoria) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.precio = precio;
        this.categoria = categoria;

     }
     public Categoria getCategoria() {
        return this.categoria;
     }
      public void setCategoria(Categoria categoria) {
       this.categoria = categoria;
     }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



    public String toString() {
        return "Producto{" +
                "tipo='" + tipo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                '}';
    }

}
