package exercitiu1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static final String FILE_PATH = "src/exercitiu1/electronice.txt";

    public static void main(String[] args) {

        List<Echipament> lista_echipamente= new ArrayList<>();

        try {
            Scanner scanner = new Scanner( new File(FILE_PATH));

            //citire
            while (scanner.hasNextLine()) {
                String[] cuvant = (scanner.nextLine()).split(";");
                Echipament.Stare stare = null;

                if(cuvant[4].compareTo("achizitionat") == 0 ) {
                    stare = Echipament.Stare.ACHIZITIONAT;
                } else if(cuvant[4].compareTo("vandut") == 0) {
                    stare = Echipament.Stare.VANDUT;
                } else if(cuvant[4].compareTo("expus") == 0) {
                    stare = Echipament.Stare.EXPUS;
                }

                if(cuvant[5].compareTo("imprimanta") == 0) {

                    Imprimanta.Tiparire tip = null;

                    if(cuvant[9].compareTo("Color") == 0) {
                        tip = Imprimanta.Tiparire.ALB_NEGRU;
                    } else {
                        tip = Imprimanta.Tiparire.COLOR;
                    }

                    lista_echipamente.add(new Imprimanta(cuvant[0], Double.parseDouble(cuvant[1]), Double.parseDouble(cuvant[2]), cuvant[3], stare, Double.parseDouble(cuvant[6]), cuvant[7], Double.parseDouble(cuvant[8]), tip ));
                }

                else if (cuvant[5].compareTo("copiator") == 0) {

                    Copiator.Format format = null;

                    if(cuvant[7].compareTo("A3") == 0 ) {
                        format = Copiator.Format.A3;
                    } else {
                        format = Copiator.Format.A4;
                    }
                    lista_echipamente.add(new Copiator(cuvant[0], Double.parseDouble(cuvant[1]), Double.parseDouble(cuvant[2]), cuvant[3], stare, Double.parseDouble(cuvant[6]), format));
                }

                else if (cuvant[5].compareTo("sistem de calcul") == 0) {
                    SistemDeCalcul.SistemeDeOperare SO = null;

                    if(cuvant[9].compareTo("Windows") == 0 ) {
                        SO = SistemDeCalcul.SistemeDeOperare.Windows;
                    } else {
                        SO = SistemDeCalcul.SistemeDeOperare.Linux;
                    }

                    lista_echipamente.add(new SistemDeCalcul(cuvant[0], Double.parseDouble(cuvant[1]), Double.parseDouble(cuvant[2]), cuvant[3], stare, cuvant[6], Double.parseDouble(cuvant[7]), Double.parseDouble(cuvant[8]), SO));
                }

            }

            //afisare
            System.out.println("Afisare echipemente \n" + lista_echipamente);

            // afisare imprimante
            System.out.println("\n\n Afisare imprimante \n\n");
            for(Echipament e: lista_echipamente) {
                if(e instanceof Imprimanta) {
                    System.out.println(e);
                }
            }

            // afisare copiatoare
            System.out.println("\n\n Afisare copiatoare \n\n");
            for(Echipament e: lista_echipamente) {
                if(e instanceof Copiator) {
                    System.out.println(e);
                }
            }

            // afisare sisteme de calcul
            System.out.println("\n\n Afisare Sisteme de caulcul \n\n");
            for(Echipament e: lista_echipamente) {
                if(e instanceof SistemDeCalcul) {
                    System.out.println(e);
                }
            }

            //Modificare stare echipament
            lista_echipamente.get(0).setStare(Echipament.Stare.VANDUT);

            //Setare mod de scriere
            if(lista_echipamente.get(0) instanceof Imprimanta) {
                ((Imprimanta)lista_echipamente.get(0)).setTiparire(Imprimanta.Tiparire.ALB_NEGRU);
            }

            //Setare format de copiere
            if(lista_echipamente.get(3) instanceof Copiator) {
                ((Copiator)lista_echipamente.get(3)).setFormat_copiere(Copiator.Format.A4);
            }

            //Setare sistem de operare

//            if(lista_echipamente.get(4) instanceof SistemDeCalcul) {
//
//            }


            //afisare
            System.out.println("Afisare echipemente \n" + lista_echipamente);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
