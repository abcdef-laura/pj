package Tema;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void MainApp(String[] args) {
        List<PerecheNumere> listaPerechi = new ArrayList<>();

        listaPerechi.add(new PerecheNumere(1, 2));
        listaPerechi.add(new PerecheNumere(3, 4));
        listaPerechi.add(new PerecheNumere(5, 6));

        scriere(listaPerechi);
        List<PerecheNumere> listaCitita = citire();


        for (PerecheNumere pereche : listaCitita) {
            System.out.println("pereche: " + pereche);
            System.out.println("consecutive în Fibonacci: " + pereche.suntConsecutiveInFibonacci());
            System.out.println("cmmdc: " + pereche.cmmc());
            System.out.println("suma cifrelor egală: " + pereche.auSumaCifrelorEgala());
            System.out.println("număr de cifre pare: " + pereche.auAcelasiNrCifrePare());
        }
    }

    // scrierea fișier JSON
    static void scriere(List<PerecheNumere> lista) {
        try (Writer writer = new FileWriter("perechi.json")) {
            Gson gson = new Gson();
            gson.toJson(lista, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // citirea fișier JSON
    static List<PerecheNumere> citire() {
        List<PerecheNumere> listaCitita = new ArrayList<>();
        try (Reader reader = new FileReader("perechi.json")) {
            Gson gson = new Gson();
            listaCitita = gson.fromJson(reader, new TypeToken<List<PerecheNumere>>() {
            }.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaCitita;
    }
}



