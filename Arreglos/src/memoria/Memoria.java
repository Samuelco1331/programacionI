package memoria;

public class Memoria {
    public void a() {
        int x = 1;
        b(x);
        System.out.println(x);
    }

    public void b(int x) {
        x = 2;
    }

    public void c() {
        int[] x = {1};
        d(x);
        System.out.println(x[0]);
    }

    public void d(int[] x) {
        x[0] = 2; // Efecto colateral
    }
}
