
package company;
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
        for(int i = 0;i < personasList.size();i++){
            if (personasList.get(i).getDni().equals(persona.getDni()) || personasList.get(i).getNsocial().equals(persona.getNsocial())) {
                System.out.println("Esta persona ya existe");
                i = personasList.size();
                check = true;
            }
        }
        if(check == false) {
            personasList.add(persona);
        }
    }

    public void bajaPersona(String dni, Persona persona) {

        for(int i = 0;i < personasList.size();i++) {

            if(personasList.get(i).getDni().equals(persona.getDni()) || personasList.get(i).getNsocial().equals(persona.getNsocial())){
                personasList.remove(i);
                i = personasList.size();
            }
        }
    }

    public Persona obtenerPersonaPorDNI(String dni, Persona persona) {

        Persona persona2 = new Persona();
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
        }
    }

    public Persona obtenerPersonaPorNumSS(String numSS, Persona persona) {

        Persona persona2 = new Persona();
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
        }
    }


    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){

        List<Persona> Scoincidencia;
        Scoincidencia = new ArrayList<>();
        Persona persona;

        for (int i=0; i<personasList.size();i++){

            persona = personasList.get(i);

            if(persona.getSalario() <=max || persona.getSalario() >= min){
                Scoincidencia = persona;
            }

        }
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
    }

    public List<Persona> obtenerTodas(){
    }

    @Override
    public String toString() {return "SeguridadSocial{" + "personasList=" + personasList + '}';
    }
}
