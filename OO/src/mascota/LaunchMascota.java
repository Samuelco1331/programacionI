package mascota;

public class LaunchMascota {
    public static void main(String[] args) {
        Persona p = new Persona("Taquicardio");
        Capibara c = new Capibara("Freddy", true);
        p.setMascota(c);
        p.presentarse();
        p.jugarConMascota();
        p.alimentarMascota();
        p.jugarConMascota();
        p.patearMascota();
    }
}
