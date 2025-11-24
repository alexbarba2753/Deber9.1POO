public class Camion extends Vehiculo {

    private double capacidadCarga;

    public Camion(String marca, String modelo, int año, double precio, double capacidadCarga) {
        super(marca, modelo, año, precio);

        if (capacidadCarga <= 0)
            throw new IllegalArgumentException("Capacidad de carga inválida");

        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularImpuestoCirculacion() {
        return (getPrecio() * 0.08) + (capacidadCarga * 50);
    }

    @Override
    public String toString() {
        return "CAMIÓN - " + super.toString() + " - Carga: " + capacidadCarga + " Ton";
    }
}
