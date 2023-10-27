package exercitiu1;

public class Copiator extends Echipament{

    private double p_ton;
    protected enum Format {A3, A4};
    private Format format_copiere = null;

    public Copiator(String denumire, double pret, double nr_inv, String zona_mag, Stare stare, double p_ton, Format format_copiere) {
        super(denumire, pret, nr_inv, zona_mag, stare);
        this.p_ton = p_ton;
        this.format_copiere = format_copiere;
    }

    public double getP_ton() {
        return p_ton;
    }

    public void setP_ton(double p_ton) {
        this.p_ton = p_ton;
    }

    public Format getFormat_copiere() {
        return format_copiere;
    }

    public void setFormat_copiere(Format format_copiere) {
        this.format_copiere = format_copiere;
    }

    @Override
    public String toString() {
        return this.getDenumire() + " " + this.getPret() + " " + this.getStare() + "\n";
    }
}
