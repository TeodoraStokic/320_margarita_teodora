package D2;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Flug flug = new Flug();

    int auswahl = -1;

    while (auswahl != 0) {

      System.out.println("\n1 = Passagier hinzufügen");
      System.out.println("2 = Passagiere anzeigen");
      System.out.println("3 = Passagier entfernen");
      System.out.println("0 = Beenden");

      System.out.print("Auswahl: ");

      auswahl = scanner.nextInt();
      scanner.nextLine();

      if (auswahl == 1) {

        System.out.print("Name: ");

        String name = scanner.nextLine();

        Passagier p = new Passagier(name);

        flug.passagierHinzufuegen(p);

        System.out.println("Passagier hinzugefügt!");
      }

      if (auswahl == 2) {

        flug.passagierListeAusgeben();
      }

      if (auswahl == 3) {

        System.out.print("Name zum Entfernen: ");

        String name = scanner.nextLine();

        flug.passagierEntfernen(name);
      }
    }

    System.out.println("Programm beendet!");

    scanner.close();
  }
}
