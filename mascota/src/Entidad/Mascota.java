package Entidad;

public class Mascota {
    private String nombre;
    private String raza;
    private int edad;
    private String alimento;

    private int energia;
    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String raza, int edad, String alimento, int energia) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.alimento = alimento;
        this.energia = 1000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", alimento='" + alimento + '\'' +
                ", energia=" + energia +
                '}';
    }
}
