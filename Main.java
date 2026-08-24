import java.util.Scanner; //Scanner wird verwendet, um Eingaben von der Tastatur einzulesen.

public class Main { // public = die Klasse kann auch von ausserhalb verwendet werden

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Heizung heizung = new Heizung(20, 2);

    heizung.setMin(10);
    heizung.setMax(30);

    boolean weiter = true;

    while (weiter) {

      System.out.println("\n--- HEIZUNG ---");
      System.out.println("Temperatur: " + heizung.getTemperature() + "°C");
      System.out.println("[+] Wärmer");
      System.out.println("[-] Kälter");
      System.out.println("[q] Beenden");
      System.out.print("Eingabe: ");

      String eingabe = scanner.nextLine();

      switch (eingabe) {
        case "+":
          heizung.waermer();
          break;

        case "-":
          heizung.colder();
          break;

        case "q":
        case "Q":
          weiter = false;
          break;

        default:
          System.out.println("Ungültige Eingabe!");
      }
    }

    scanner.close();
  }
}
