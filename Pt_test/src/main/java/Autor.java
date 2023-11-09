import java.time.LocalDate;
import java.util.List;

public class Autor {
    private String nume;
    private TipOpera tip;
    private List<Carte> lista_carti;
    private LocalDate data_nasterii;

    public Autor(String nume, TipOpera tip, List<Carte> lista_carti, LocalDate data_nasterii) {
        this.nume = nume;
        this.tip = tip;
        this.lista_carti = lista_carti;
        this.data_nasterii = data_nasterii;
    }

    public LocalDate getData_nasterii() {
        return data_nasterii;
    }

    public void setData_nasterii(LocalDate data_nasterii) {
        this.data_nasterii = data_nasterii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public TipOpera getTip() {
        return tip;
    }

    public void setTip(TipOpera tip) {
        this.tip = tip;
    }

    public Autor() {
    }

    public List<Carte> getLista_carti() {
        return lista_carti;
    }

    public void setLista_carti(List<Carte> lista_carti) {
        this.lista_carti = lista_carti;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nume='" + nume + '\'' +
                ", tip=" + tip +
                ", lista_carti=" + lista_carti +
                ", data_nasterii=" + data_nasterii +
                '}';
    }
}
