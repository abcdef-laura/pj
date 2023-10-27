package exercitiul4;

import java.time.LocalDate;
import java.util.Scanner;

public class Persoana {
    private String nume = null;
    private String cnp = null;

    Persoana() {
        Scanner scanner = new Scanner(System.in);

        String newName = null;
        String cnp = null;

        do {
            System.out.print("Introduce nume: ");
            newName = scanner.nextLine();
            System.out.print("Introduce CNP: ");
            cnp = scanner.nextLine();
        } while (newName != null && cnp != null);

    }

    public LocalDate getVarsta() {
        return LocalDate.now();
    }

    public String toString() {
        return this.nume + cnp + getVarsta();
    }



}
