
package seguridad_social;

import java.util.ArrayList;
import java.util.List;


public class SeguridadSocial {

    private List<Persona> personasList;

    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
    public void altaPersona(Persona persona) {

        boolean check = false;
        /* for(int i = 0;i < personasList.size();i++){
            if (personasList.get(i).getDni().equals(persona.getDni()) || personasList.get(i).getNsocial().equals(persona.getNsocial())) {
                System.out.println("Esta persona ya existe");
                i = personasList.size();
                check = true;
            }
        }
        if(check == false) {
            personasList.add(persona);
        } */

        for(Persona personaActual : personasList){
            if(personaActual.getDni().equals(persona.getDni()) || personaActual.getNsocial().equals(persona.getNsocial())){
                check = true;
                break;
            }
        }
        if(check == false) {
            personasList.add(persona);
        }

       // boolean repe = personasList.stream().anyMatch(persona.getDni().equals(persona.g))
    }

    public void bajaPersona(String dni, String ss) {

        /* for(int i = 0;i < personasList.size();i++) {

            if(personasList.get(i).getDni().equals(persona.getDni()) || personasList.get(i).getNsocial().equals(persona.getNsocial())){
                personasList.remove(i);
                i = personasList.size();
            }
        } */
        int i = 0;
        Persona aux = null;
        for(Persona personaActual : personasList) {

            if(personasList.get(i).getDni().equals(dni) || personasList.get(i).getNsocial().equals(ss)){
                aux = personaActual;
                break;
            }
        }
        if(aux != null){
            personasList.remove(aux);
        }

      // JAVA 8
        //  personasList.removeIf(persona1 -> persona.getDni().equals(dni));
    }

    public Persona obtenerPersonaPorDNI(String dni) {

       /*  Persona persona2 = new Persona();
        boolean check = false;

        for(int i = 0; i < personasList.size();i++){

            if(personasList.get(i).getDni().equals(persona.getDni())){
                persona2 = personasList.get(i);
                check = true;
            }
        }
        if(!check){
            System.out.println("No coincide");
            return persona;
        }
        else{
            return persona2;
        } */
       for (Persona personaActual : personasList){
           if(personaActual.getDni().equals(dni)){
               return personaActual;
           }
       }
       return null;
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {

        /* Persona persona2 = new Persona();
        boolean check = false;

        for(int i = 0; i < personasList.size();i++){

            if(personasList.get(i).getDni().equals(numSS)){
                persona2 = personasList.get(i);
                check = true;
            }
        }
        if(!check){
            System.out.println("No coincide");
            return persona;
        }
        else{
            return persona2;
        } */
        for (Persona personaActual : personasList){
            if(personaActual.getNsocial().equals(numSS)){
                return personaActual;
            }
        }
        return null;
    }


    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

        /*List<Persona> Scoincidencia;
        Scoincidencia = new ArrayList<>();
        Persona persona;

        for (int i=0; i<personasList.size();i++){

            persona = personasList.get(i);

            if(persona.getSalario() <=max || persona.getSalario() >= min){
                Scoincidencia = persona;
            }

        } */

        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personasList){
            if(personaActual.getSalario() <=max || personaActual.getSalario() >= min){
                aux.add(personaActual);
            }
        }
        return aux;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){

        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personasList){
            if(personaActual.getSalario() > edad){
                aux.add(personaActual);
            }
        }
        return aux;
    }

    public List<Persona> obtenerTodas(){

        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personasList){
            aux.add(personaActual);
        }
        return aux;
    }

    @Override
    public String toString() {return "SeguridadSocial{" + "personasList=" + personasList + '}';
    }


}
