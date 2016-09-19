
package company;
import java.util.List;

public class SeguridadSocial {

    private List&lt;Persona&gt; personasList;

    public SeguridadSocial() {

        personasList = new ArrayList&lt;&gt;();

    }

// Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social

    public void altaPersona(Persona persona) {

    }

    public void bajaPersona(String dni) {

    }

    public Persona obtenerPersonaPorDNI(String dni) {

    }

    public Persona obtenerPersonaPorNumSS(String numSS) {

    }

    public List&lt;Persona&gt; obtenerPersonasRangoSalarial(double min, double max){

    }

    public List&lt;Persona&gt; obtenerPersonasMayoresQue(int edad){

    }

    public List&lt;Persona&gt; obtenerTodas(){

    }

    @Override

    public String toString() {

        return &quot;SeguridadSocial{&quot; +

                &quot;personasList=&quot; + personasList +

                &#39;}&#39;;

    }

}