package mascota;
public class Capibara {
    private String nombre;
    private boolean hambre;
    private boolean feliz = false;
    public Capibara(String nombre, boolean hambre) {
        this.nombre = nombre;
        this.hambre = hambre;
    }
    public String getNombre() {
        return nombre;
    }
    public boolean isFeliz() {
        return feliz;
    }
    public void comer() {
        if (hambre) {
            System.out.println(nombre + " come.");
            hambre = false;
        } else {
            System.out.println(nombre + " no tiene hambre.");
        }
    }
    public void jugar() {
        if (hambre) {
            System.out.println(nombre + " tiene hambre no quiere jugar.");
        } else {
            System.out.println(nombre + " juega.");
            feliz = true;
            hambre = true;
        }
    }
    public void recibirPatada(Persona persona) {
        System.out.println(nombre + " recibe una patada.");
        System.out.println("Atatau!");
        feliz = false;
        System.out.println(nombre + " contraataca!");
        persona.recibirMordida();
    }
}
