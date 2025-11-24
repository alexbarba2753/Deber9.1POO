public class Main {
    public static void main(String[] args) {

        System.out.println("=== PRUEBAS DE EXCEPCIONES ===");

        // Año fuera de rango
        try {
            new Auto("Toyota", "Corolla", 1800, 15000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error (año): " + e.getMessage());
        }

        // Precio negativo
        try {
            new Moto("Honda", "CBR", 2020, -2000, 500);
        } catch (IllegalArgumentException e) {
            System.out.println("Error (precio): " + e.getMessage());
        }

        // Crear concesionaria
        Concesionaria c = new Concesionaria();

        // Probar calcular impuestos con lista vacía
        try {
            c.calcularTotalImpuestos();
        } catch (IllegalStateException e) {
            System.out.println("Error (inventario vacío): " + e.getMessage());
        }

        System.out.println("\n=== AGREGANDO VEHÍCULOS ===");

        // 6 vehículos válidos
        c.agregarVehiculo(new Auto("Toyota", "Corolla", 2020, 18000));
        c.agregarVehiculo(new Auto("Kia", "Rio", 2022, 17000, 2));

        c.agregarVehiculo(new Moto("Yamaha", "FZ", 2021, 5000, 150));
        c.agregarVehiculo(new Moto("Honda", "CBR", 2022, 9000, 600));

        c.agregarVehiculo(new Camion("Volvo", "FH", 2019, 85000, 12));
        c.agregarVehiculo(new Camion("Hino", "300", 2020, 60000, 7));

        System.out.println("Vehículos agregados correctamente.");

        System.out.println("\n=== TOTAL IMPUESTOS ===");
        double total = c.calcularTotalImpuestos();
        System.out.println("Total impuestos: $" + total);

        System.out.println("\n=== VEHÍCULO MÁS CARO ===");
        System.out.println(c.obtenerVehiculoMasCaro());

        System.out.println("\n=== ORDENANDO POR PRECIO ===");
        c.ordenarPorPrecio();

        for (Vehiculo v : c.getInventario()) {
            System.out.println(v);
        }
    }
}
