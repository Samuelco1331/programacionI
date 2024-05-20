package arreglos;

public class Estudiante {
    // private String nombre;
    String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Buenas tardes, estimado profesor.");
    }

    public void presentarse() {
        System.out.println("Mi nombre es " + nombre);
    }
}
