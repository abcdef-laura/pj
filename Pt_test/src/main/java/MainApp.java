import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void scriere(List<Autor> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            File file=new File("src/main/resources/autori.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Autor> citire() {
        try {
            File file=new File("src/main/resources/autori.json");
            ObjectMapper mapper=new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            List<Autor> autori =
                    mapper
                    .readValue(file, new TypeReference<List<Autor>>(){});
            return autori;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {

        List<Carte> listaCarti1 = new ArrayList<Carte>();
        List<Carte> listaCarti2 = new ArrayList<Carte>();
        List<Autor> listaAutori = new ArrayList<Autor>();
        Carte carte1 = new Carte("aaa", 120, true);
        Carte carte2 = new Carte("bbb", 122, false);
        Carte carte3 = new Carte("ccc", 1210, true);

        listaCarti1.add(carte1);
        listaCarti1.add(carte2);
        listaCarti2.add(carte3);

        Autor autor1 = new Autor("ION", TipOpera.HORROR, listaCarti1, LocalDate.parse("2023-05-23"));
        Autor autor2 = new Autor("Paul", TipOpera.BELETRISTICA, listaCarti2, LocalDate.parse("2021-04-03"));

        listaAutori.add(autor1);
        listaAutori.add(autor2);

       // scriere(listaAutori);

        List<Autor> listaAutori1 = citire();

        //Referinta la metode
        listaAutori1.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        int numar = 0;
        boolean ok = true;

        while (ok) {
            try {

                System.out.print("Valoarea este : ");
                numar = scanner.nextInt();
                ok = false;

            } catch (Exception e) {
                System.out.println("Valoare gresita !\nValoare nou : ");
                numar = scanner.nextInt();

            }
        }

        for(int i = 0; i < numar; i++){
           // System.out.println(listaAutori1.get(0).getLista_carti().get(i));
        }

        List<Autor> listaNoua = listaAutori1.stream().filter(autor -> autor.getNume().equals("ION")).toList();

        List<Autor> listaNoua2 = listaNoua.stream().filter(autor -> autor.getLista_carti().stream().filter(carte -> carte.isAudio()).isParallel()).toList();

        listaNoua2.forEach(System.out::println);
    }
}
