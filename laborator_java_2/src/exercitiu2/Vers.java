package exercitiu2;

public class Vers {
    private String vers = null;

    Vers(String vers) {
        this.vers = vers;
    }

    private static boolean esteVocala(char ch)
    {
        ch = Character.toLowerCase(ch);
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }

    public double getNumarVocale () {
        double numarVocale = 0;
        String[] cuvinte = this.vers.split(" ");

        for (String cuvant : cuvinte) {
            for (int j = 0; j < cuvant.length(); j++) {
                if (esteVocala(cuvant.charAt(j))) {
                    numarVocale += 1;
                }
            }
        }

        return numarVocale;
    }

    public int getNumarCuvinte () {
        String[] cuvinte = vers.split(" ");
        return cuvinte.length;
    }

    public boolean contains (String SUBSTRING) {
        String[] cuvinte = vers.split(" ");
        return cuvinte[cuvinte.length - 1].contains(SUBSTRING);
    }

    public String[] getWords () {
        String[] cuvinte = this.vers.split(" ");
        return cuvinte;
    }

}
