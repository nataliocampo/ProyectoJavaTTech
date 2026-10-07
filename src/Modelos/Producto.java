package Modelos;

public class Producto {
    private String tipo;
    private String modelo;
    private double precio;
    private String talle;
    private String material;

        public Producto(String tipo, String modelo, double precio, String talle, String material) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.precio = precio;
        this.talle = talle;
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

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

    public String toString() {
        return "Producto{" +
                "tipo='" + tipo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", talle='" + talle + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

}
