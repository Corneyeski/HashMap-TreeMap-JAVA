package Coches_y_Taller;

import Coches_y_Taller.Coche;

import java.util.*;
import java.util.stream.Collectors;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche) {
        coches.add(coche);
    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7
    public Coche obtenerVehiculo(String matricula) {

        for (Coche coche : coches) {
            if (coche.equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    public void eliminarVehiculo(String matricula) {
        coches.remove(matricula);
    }

    public Coche obtenerVehiculoPrecioMax() {
        Coche coche = null;

        for (Coche aux : coches) {
            if (aux.getPrecio() > coche.getPrecio()) {
                coche.setPrecio(aux.getPrecio());
            }
        }
        return coche;
    }

    public List<Coche> obtenerVehiculosMarca(String marca) {

        List<Coche> rangos = new ArrayList<>();

        for (Coche coche : coches) {

            if (coche.getMarca().equals(marca)) {
                rangos.add(coche);
            }
        }
        return rangos;
    }

    public List<Coche> obtenerTodos() {

        return new ArrayList<>(coches);
    }
}