public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String modelo, int año, double precio, int cilindrada) {
        super(marca, modelo, año, precio);

        if (cilindrada <= 0)
            throw new IllegalArgumentException("Cilindrada inválida");

        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularImpuestoCirculacion() {
        if (cilindrada <= 250)
            return getPrecio() * 0.02;
        else
            return getPrecio() * 0.04;
    }

    @Override
    public String toString() {
        return "MOTO - " + super.toString() + " - Cilindrada: " + cilindrada + "cc";
    }
}
