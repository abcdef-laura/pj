package exercitiu2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public final static String INPUT_FILE_PATH = "src/exercitiu2/cantec_in.txt";
    public final static String OUTPUT_FILE_PATH = "src/exercitiu2/cantec_out.txt";
    public final static String SUBSTRING = "re";


    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File(INPUT_FILE_PATH));
            FileWriter fileWriter = new FileWriter(OUTPUT_FILE_PATH);

            while(scanner.hasNextLine()) {
                Vers vers = new Vers(scanner.nextLine());

                double randomNumber = new Random().nextDouble();
                System.out.println(randomNumber);

                for (String cuvant : vers.getWords()) {
                    if(randomNumber < 0.1) {
                        fileWriter.write(cuvant.toUpperCase() + " ");
                    } else {
                        fileWriter.write(cuvant+ " ");
                    }
                }

                fileWriter.write(" Vocale: " + vers.getNumarVocale() + " Cuvinte " + vers.getNumarCuvinte());
                if(vers.contains(SUBSTRING)) {
                    fileWriter.write(" *");
                }

                fileWriter.write("\n");
            }

            fileWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
