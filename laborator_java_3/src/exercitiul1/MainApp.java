package exercitiul1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static final String FILE_PATH ="src/exercitiul1/in.txt";

    public static void main(String[] args) {
        List<Parabola> lista_parabole = new ArrayList<Parabola>();
        int[] coordonateXY = {-1, -1};
        try {
            Scanner scanner = new Scanner(new File(FILE_PATH));

            while(scanner.hasNextLine()) {
                String[] coordonate = (scanner.nextLine()).split(" ");
                lista_parabole.add(new Parabola(Integer.parseInt(coordonate[0]), Integer.parseInt(coordonate[1]), Integer.parseInt(coordonate[2])));
            }

            for(Parabola parabola: lista_parabole) {
                System.out.println(parabola.toString());
                System.out.println(parabola.getVarfParabola());
            }
            System.out.println("\n\nMijloc:");

            coordonateXY = Parabola.varf_varf_mij_segment(lista_parabole.get(0), lista_parabole.get(3));
            System.out.println("X: " + coordonateXY[0] + " Y: " + coordonateXY[1]);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
