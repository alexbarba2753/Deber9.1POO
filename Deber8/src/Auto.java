public class Auto extends Vehiculo {
    private int numeroPuertas;

    // Constructor por defecto (4 puertas)
    public Auto(String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
        this.numeroPuertas = 4;
    }

    // Constructor sobrecargado
    public Auto(String marca, String modelo, int año, double precio, int numeroPuertas) {
        super(marca, modelo, año, precio);
        if (numeroPuertas <= 0)
            throw new IllegalArgumentException("Número de puertas inválido");
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularImpuestoCirculacion() {
        return getPrecio() * 0.05;
    }

    @Override
    public String toString() {
        return "AUTO - " + super.toString() + " - Puertas: " + numeroPuertas;
    }
}
