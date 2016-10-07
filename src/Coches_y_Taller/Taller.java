package Coches_y_Taller;
import java.util.*;

public class Taller {
    private Map<Persona, Coche> reparaciones = new TreeMap<>(Comparator.comparing(Persona::getNsocial));

    public void registrarReparacion(Persona persona, Coche coche){
        reparaciones.putIfAbsent(persona, coche);
    }

    public Coche obtenerCoche(Persona persona){

        return reparaciones.get(persona);
    }

    public Set<Persona> obtenerClientes(){

        return reparaciones.keySet();
    }
}
