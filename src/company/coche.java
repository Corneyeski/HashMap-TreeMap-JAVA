package company;
public class coche {

    private String marca;
    private String modelo;
    private String matricula;
    private Integer potencia;
    private Double precio;

    public coche(String marca, String modelo, String matricula, Integer potencia, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.potencia = potencia;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        coche coche = (coche) o;

        if (marca != null ? !marca.equals(coche.marca) : coche.marca != null) return false;
        if (modelo != null ? !modelo.equals(coche.modelo) : coche.modelo != null) return false;
        if (matricula != null ? !matricula.equals(coche.matricula) : coche.matricula != null) return false;
        if (potencia != null ? !potencia.equals(coche.potencia) : coche.potencia != null) return false;
        return precio != null ? precio.equals(coche.precio) : coche.precio == null;

    }

    @Override
    public int hashCode() {
        int result = marca != null ? marca.hashCode() : 0;
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (matricula != null ? matricula.hashCode() : 0);
        result = 31 * result + (potencia != null ? potencia.hashCode() : 0);
        result = 31 * result + (precio != null ? precio.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", precio=" + precio +
                '}';
    }
}


