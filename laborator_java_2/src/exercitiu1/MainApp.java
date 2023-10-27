package exercitiu1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    private  static final String FILE_PATH = "src/exercitiu1/judete_in.txt";

    public static void main(String[] args) {

        String oras_cautat = null;
        String[] lista_judete= null;
        Scanner scanner = new Scanner(System.in);

        // Citire judet dorit
        do{
            System.out.println("Introduce judetul cautat: ");
            oras_cautat = scanner.nextLine();
        } while (oras_cautat.isEmpty());


        Scanner scan = null;
        try {
            scan = new Scanner(new File(FILE_PATH));

            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                String judet = data.toString();

                if(lista_judete != null) {

                    String[] newArray = new String[lista_judete.length + 1];


                    for (int i = 0; i < lista_judete.length; i++) {
                        newArray[i] = lista_judete[i];
                    }

                    newArray[lista_judete.length] = judet;
                    lista_judete = newArray;
                } else {
                    lista_judete = new String[1];
                    lista_judete[0] = judet;
                }
            }

            // sortare
            Arrays.sort(lista_judete);
            System.out.println(Arrays.binarySearch(lista_judete, oras_cautat));


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
