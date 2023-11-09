public class Carte {
    private String titlu;
    private int nr_pag;

    private boolean audio;

    public Carte(String titlu, int nr_pag, boolean audio) {
        this.titlu = titlu;
        this.nr_pag = nr_pag;
        this.audio = audio;
    }

    public String getTitlu() {
        return titlu;
    }

    public int getNr_pag() {
        return nr_pag;
    }

    public boolean isAudio() {
        return audio;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Carte() {
    }

    public void setNr_pag(int nr_pag) {
        this.nr_pag = nr_pag;
    }

    public void setAudio(boolean audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", nr_pag=" + nr_pag +
                ", audio=" + audio +
                '}';
    }
}
