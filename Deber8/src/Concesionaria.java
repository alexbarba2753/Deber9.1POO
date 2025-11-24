import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Concesionaria {

    private ArrayList<Vehiculo> inventario;

    public Concesionaria() {
        inventario = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        if (v == null)
            throw new NullPointerException("No se puede agregar un vehículo null");
        inventario.add(v);
    }

    public double calcularTotalImpuestos() {
        if (inventario.isEmpty())
            throw new IllegalStateException("Inventario vacío");

        double total = 0;
        for (Vehiculo v : inventario) {
            total += v.calcularImpuestoCirculacion();
        }
        return total;
    }

    public Vehiculo obtenerVehiculoMasCaro() {
        if (inventario.isEmpty())
            throw new IllegalStateException("Inventario vacío");

        Vehiculo mayor = inventario.get(0);

        for (Vehiculo v : inventario) {
            if (v.getPrecio() > mayor.getPrecio())
                mayor = v;
        }

        return mayor;
    }

    public void ordenarPorPrecio() {
        Collections.sort(inventario, Comparator.comparingDouble(Vehiculo::getPrecio));
    }

    public ArrayList<Vehiculo> getInventario() {
        return inventario;
    }
}
