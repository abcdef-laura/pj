package exercitiu1;

public class Imprimanta extends Echipament{

    private double ppm;
    private String dpi;
    private double p_car;
    protected enum Tiparire {COLOR, ALB_NEGRU};
    private Tiparire tiparire = null;

    public Imprimanta(String denumire, double pret, double nr_inv, String zona_mag, Echipament.Stare stare, double ppm, String dpi, double p_car, Tiparire tiparire) {
        super(denumire, pret, nr_inv, zona_mag, stare);
        this.ppm = ppm;
        this.dpi = dpi;
        this.p_car = p_car;
        this.tiparire = tiparire;
    }

    public double getPpm() {
        return ppm;
    }

    public void setPpm(double ppm) {
        this.ppm = ppm;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public double getP_car() {
        return p_car;
    }

    public void setP_car(double p_car) {
        this.p_car = p_car;
    }

    public Tiparire getTiparire() {
        return tiparire;
    }

    public void setTiparire(Tiparire tiparire) {
        this.tiparire = tiparire;
    }

    @Override
    public String toString() {
        return this.getDenumire() + " " + this.getPret() + " " + this.getStare() + "\n";
    }
}
