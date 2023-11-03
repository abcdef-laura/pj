package Lab6ex1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Optiuni:");
        System.out.println("1. Afișarea listei de angajați folosind referințe la metode.\n");
        System.out.println("2. Afișarea angajaților care au salariul peste 2500 RON. Rezolvarea va utiliza stream-uri.\n" +
                "Interfața funcțională Predicate, care este parametrul metodei de filtrare va fi\n" +
                "implementată printr-o expresie Lambda.\n");
        System.out.println("3. Crearea unei liste cu angajații din luna aprilie, a anului trecut, care au funcție de\n" +
                "conducere (postul conține unul din cuvintele sef sau director). Pentru crearea unei liste\n" +
                "dintr-un stream se va utiliza operația terminală collect (Collectors.toList()). Se vor\n" +
                "utiliza steram-uri şi expresii lambda. Noua listă va fi apoi afișată. Anul curent se va citi\n" +
                "din sistem. ");
        System.out.println("4. Afișarea angajaților care nu au funcție de conducere (postul lor nu conține cuvintele\n" +
                "director sau șef), în ordine descrescătoare a salariilor, folosind stream-uri şi expresii\n" +
                "lambda.\n");
        System.out.println("5. Extragerea din lista de angajați a unei liste de String-uri care conține numele angajaților\n" +
                "scrise cu majuscule. Rezolvarea va utiliza steram-uri, metoda map() şi operația\n" +
                "terminală collect(). Lista de String-uri va fi afișată. ");
        System.out.println("6. Afișarea salariilor mai mici de 3000 de RON (doar salariile, fără alte informații)\n" +
                "folosind stream-uri, expresii lambda, referințe la metode şi metoda map(). ");
        System.out.println("7. Afișarea datelor primului angajat al firmei. Se va determina minimul din stream\n" +
                "furnizând comparatorul adecvat printr-o expresie Lambda. Dacă containerul Optional\n" +
                "returnat de funcția min() conține o valoare, atunci se va afișa acea valoare, altfel se va\n" +
                "afișa un mesaj corespunzător. ");
        System.out.println("8. Afișarea de statistici referitoare la salariul angajaților. Se va afișa salariul mediu,\n" +
                "salariul minim şi salariul maxim. Rezolvarea va utiliza stream-uri şi operația terminală\n" +
                "collect(Collectors. summarizingDouble())");
        System.out.println("9. Afișarea unor mesaje care indică dacă printre angajați există cel puțin un “Ion”. Se vor\n" +
                "afișa mesaje precum: „Firma are cel puțin un Ion angajat”, „Firma nu are nici un Ion\n" +
                "angajat”, în funcție de situație. Rezolvarea va utiliza stream-uri şi metoda findAny()\n" +
                "care va returna un container Optional care poate să conțină un element sau nu. Metoda\n" +
                "ifPresentOeElse din clasa Optional se va utiliza pentru afișarea mesajelor\n" +
                "corespunzătoare");
        System.out.println("10. Afișarea numărului de persoane care s-au angajat în vara anului precedent. Se va\n" +
                "utiliza metoda count() din interfaţa Stream.");

        System.out.println("Alegerea dumneavoastra:");
        int opt=Integer.parseInt(scanner.next());
        List<Angajat>angajatList=citire();
       switch (opt){
            case 1: scriere(angajatList);
                System.out.println("gata :)");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                break;

        }

    }
    public static void scriere(List<Angajat>angajatList){
        try{
            ObjectMapper mapper= new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            File file = new File("src/main/resources/angajati.json");
            mapper.writeValue(file,angajatList);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Angajat> citire(){
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            File file=new File("src/main/resources/angajati.json");
            List<Angajat>angajatList= mapper.readValue(file, new TypeReference<List<Angajat>>() {});
            return angajatList;

        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
