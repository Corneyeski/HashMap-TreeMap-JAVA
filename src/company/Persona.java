package company;

public class Persona {

    private String dni = "" ;
    private String nsocial;
    private String nombre;
    private String apellidos;
    private int edad;
    private double salario;

    public Persona(){}

    public Persona(String dni, String nsocial, String nombre, String apellidos, int edad, double salario) {
        this.dni = dni;
        this.nsocial = nsocial;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNsocial() {
        return nsocial;
    }

    public void setNsocial(String nsocial) {
        this.nsocial = nsocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


}
