package mascota;
public class Persona {
    private String nombre;
    private Capibara mascota;
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public void setMascota(Capibara mascota) {
        this.mascota = mascota;
    }
    public void presentarse() {
        System.out.printf("Hola, me llamo %s y tengo una bonita capibara llamada %s que ",nombre, mascota.getNombre());
        if (!mascota.isFeliz()) {
            System.out.print("no ");
        }
        System.out.println("esta muy feliz.");
    }
    public void alimentarMascota() {
        System.out.printf("%s alimenta a %s. \n",nombre, mascota.getNombre());
        mascota.comer();
    }
    public void jugarConMascota() {
        System.out.printf("%s juega con %s. \n",nombre, mascota.getNombre());
        mascota.jugar();
    }
    public void patearMascota() {
        System.out.printf("%s patea a %s \n",nombre, mascota.getNombre());
        mascota.recibirPatada(this);
    }
    public void recibirMordida() {
        System.out.println("A " + nombre + " le da gangrena y se muere.");
    }
}
