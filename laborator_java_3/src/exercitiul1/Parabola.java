package exercitiul1;

public class Parabola {

    /**
     * Clasa {@code Parabola} repreinta o parabola.
     * Clasa {@code Parabola} contine trei xoordonate: a, b, c
     * @since   12.0
     */

    private int a, b, c;

    public Parabola(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "\nF(x) = " + a + " " + "x^2" + " + "+ b + " x " + "+ " + c + ". \n";
    }

    public String getVarfParabola() {
        return "X: " + (-this.b / (2 * this.a)) + " Y: " + (-this.b * this.b + 4 * this.a * this.c) / (4 * this.a);
    }

    public int[] varf_varf_mij_segment (Parabola parabola_primita) {

        int[] coordonate = {-1, -1};
        int x_parabola_existenta = -this.b / (2 * this.a);
        int y_parabola_existenta = (-this.b * this.b + 4 * this.a * this.c) / (4 * this.a);
        int x_parabola_primita = -parabola_primita.b / (2 * parabola_primita.a);
        int y_parabola_primita = (-parabola_primita.b * parabola_primita.b + 4 * parabola_primita.a * parabola_primita.c) / (4 * parabola_primita.a);

        if(x_parabola_primita > x_parabola_existenta) {
            coordonate[0] = (x_parabola_primita - x_parabola_existenta) / 2;
        } else {
            coordonate[0] = (x_parabola_existenta - x_parabola_primita) / 2;
        }

        if(y_parabola_primita > y_parabola_existenta) {
            coordonate[1] = (y_parabola_primita - y_parabola_existenta) / 2;
        } else {
            coordonate[1] = (y_parabola_existenta - y_parabola_primita) / 2;
        }
        return coordonate;
    }

    public static int[] varf_varf_mij_segment (Parabola parabola_primita1, Parabola parabola_primita2) {
        int[] coordonate = {-1, -1};
        int x_parabola_existenta = -parabola_primita1.b / (2 * parabola_primita1.a);
        int y_parabola_existenta = (-parabola_primita1.b * parabola_primita1.b + 4 * parabola_primita1.a * parabola_primita1.c) / (4 * parabola_primita1.a);
        int x_parabola_primita = -parabola_primita2.b / (2 * parabola_primita2.a);
        int y_parabola_primita = (-parabola_primita2.b * parabola_primita2.b + 4 * parabola_primita2.a * parabola_primita2.c) / (4 * parabola_primita2.a);

        if(x_parabola_primita > x_parabola_existenta) {
            coordonate[0] = (x_parabola_primita - x_parabola_existenta) / 2;
        } else {
            coordonate[0] = (x_parabola_existenta - x_parabola_primita) / 2;
        }

        if(y_parabola_primita > y_parabola_existenta) {
            coordonate[1] = (y_parabola_primita - y_parabola_existenta) / 2;
        } else {
            coordonate[1] = (y_parabola_existenta - y_parabola_primita) / 2;
        }
        return coordonate;
    }

    public double lung_seg_varf(Parabola parabola_primita) {
        int x_parabola_existenta = -this.b / (2 * this.a);
        int y_parabola_existenta = (-this.b * this.b + 4 * this.a * this.c) / (4 * this.a);
        int x_parabola_primita = -parabola_primita.b / (2 * parabola_primita.a);
        int y_parabola_primita = (-parabola_primita.b * parabola_primita.b + 4 * parabola_primita.a * parabola_primita.c) / (4 * parabola_primita.a);

        double lungime = Math.hypot(x_parabola_primita - x_parabola_existenta, y_parabola_primita - y_parabola_existenta);

        return lungime;
    }

    public double lung_seg_varf(Parabola parabola_primita1, Parabola parabola_primita2) {
        int x_parabola_existenta = -parabola_primita1.b / (2 * parabola_primita1.a);
        int y_parabola_existenta = (-parabola_primita1.b * parabola_primita1.b + 4 * parabola_primita1.a * parabola_primita1.c) / (4 * parabola_primita1.a);
        int x_parabola_primita = -parabola_primita2.b / (2 * parabola_primita2.a);
        int y_parabola_primita = (-parabola_primita2.b * parabola_primita2.b + 4 * parabola_primita2.a * parabola_primita2.c) / (4 * parabola_primita2.a);

        double lungime = Math.hypot(x_parabola_primita - x_parabola_existenta, y_parabola_primita - y_parabola_existenta);

        return lungime;
    }

}