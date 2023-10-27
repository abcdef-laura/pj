package exercitiu1;

public class Echipament {
    private String denumire = null;
    private double pret;
    private double nr_inv;
    private String zona_mag;
    protected enum Stare {ACHIZITIONAT, EXPUS, VANDUT};
    private Stare stare = null;

    public Echipament(String denumire, double pret, double nr_inv, String zona_mag, Stare stare) {
        this.denumire = denumire;
        this.pret = pret;
        this.nr_inv = nr_inv;
        this.zona_mag = zona_mag;
        this.stare = stare;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getNr_inv() {
        return nr_inv;
    }

    public void setNr_inv(double nr_inv) {
        this.nr_inv = nr_inv;
    }

    public String getZona_mag() {
        return zona_mag;
    }

    public void setZona_mag(String zona_mag) {
        this.zona_mag = zona_mag;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    @Override
    public String toString() {
        return "";
    }
}
