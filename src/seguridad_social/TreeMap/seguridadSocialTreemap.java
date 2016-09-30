package seguridad_social.TreeMap;

import seguridad_social.Persona;

import java.util.*;

public class seguridadSocialTreemap {

    private Map<String, Persona> personaMapDni = new TreeMap<>();
    private Map<String, Persona> personaMapSs = new TreeMap<>();

    public void altaPersona(Persona persona) {

        if (!personaMapDni.containsKey(persona.getDni()) && !personaMapSs.containsKey(persona.getNsocial())) {

            personaMapDni.put(persona.getDni(), persona);
            personaMapSs.put(persona.getNsocial(), persona);
        }
    }

    public void bajaPersona(Persona persona) {
        if (personaMapDni.containsKey(persona.getDni()) && personaMapSs.containsKey(persona.getNsocial())) {

            personaMapDni.remove(persona.getDni());
            personaMapSs.remove(persona.getNsocial());
        }
    }

    public Persona obtenerPersonaporDni(String dni) {

        //personaMapDni.remove(dni); Borrar algo en a BBDD
        //personaMapDni.values(); Coge todos los Values
        //personaMapDni.keySet(); Coge todas las keys
        return personaMapDni.get(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        return personaMapSs.get(numSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max) {

        List<Persona> rangos = new ArrayList<>();

        int i = personaMapDni.size();

        for (int j = 0; j < i; j++) {
            Persona persona = personaMapDni.get(j);

            if (persona.getSalario() >= min && persona.getSalario() <= max) {
                rangos.add(persona);
            }
        }

        return rangos;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad) {

        List<Persona> rangos = new ArrayList<>();

        int i = personaMapDni.size();

        for (Persona persona : personaMapDni.values()) {

            if (persona.getEdad() > edad) {
                rangos.add(persona);
            }
        }
        return rangos;
    }

    public List<Persona> obtenerTodas() {


        for (String dni : personaMapDni.keySet()) {
            System.out.println(dni);
        }
        return new ArrayList<>(personaMapDni.values());
    }
}
