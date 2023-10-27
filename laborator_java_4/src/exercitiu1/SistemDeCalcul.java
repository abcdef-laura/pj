package exercitiu1;

public class SistemDeCalcul extends Echipament {
    private String tip_mon;
    private double vit_proc;
    private double c_hdd;

    protected enum SistemeDeOperare {Windows, Linux}

    ;
    private SistemeDeOperare SO = null;

    public SistemDeCalcul(String denumire, double pret, double nr_inv, String zona_mag, Stare stare, String tip_mon, double vit_proc, double c_hdd, SistemeDeOperare SO) {
        super(denumire, pret, nr_inv, zona_mag, stare);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.SO = SO;
    }

    public String getTip_mon() {
        return tip_mon;
    }

    public void setTip_mon(String tip_mon) {
        this.tip_mon = tip_mon;
    }

    public double getVit_proc() {
        return vit_proc;
    }

    public void setVit_proc(double vit_proc) {
        this.vit_proc = vit_proc;
    }

    public double getC_hdd() {
        return c_hdd;
    }

    public void setC_hdd(double c_hdd) {
        this.c_hdd = c_hdd;
    }

    public SistemeDeOperare getSO() {
        return SO;
    }

    public void setSO(SistemeDeOperare SO) {
        this.SO = SO;
    }


    @Override
    public String toString() {
        return this.getDenumire() + " " + this.getPret() + " " + this.getStare() + "\n";
    }
}
