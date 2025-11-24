public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    public Vehiculo(String marca, String modelo, int año, double precio) {
        if (marca == null || marca.isEmpty())
            throw new IllegalArgumentException("Marca inválida");
        if (modelo == null || modelo.isEmpty())
            throw new IllegalArgumentException("Modelo inválido");
        if (año < 1900 || año > 2025)
            throw new IllegalArgumentException("Año fuera de rango (1900-2025)");
        if (precio <= 0)
            throw new IllegalArgumentException("Precio debe ser mayor a 0");

        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double calcularImpuestoCirculacion();

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + año + ") - Precio: $" + precio;
    }
}
