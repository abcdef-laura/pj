package exercitiu3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți șirul de caractere: ");
        String inputString = scanner.nextLine();

        System.out.print("Introduceți șirul de caractere pentru inserare: ");
        String insertString = scanner.nextLine();

        System.out.print("Introduceți poziția la care doriți să inserați șirul: ");
        int position = scanner.nextInt();

        System.out.print("Introduceți numărul de caractere pe care doriți să le ștergeți: ");
        int deleteCount = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder(inputString);

        stringBuilder.insert(position, insertString);

        stringBuilder.delete(position, position + deleteCount);

        System.out.println("Șirul rezultat: " + stringBuilder.toString());

        scanner.close();
    }
}
