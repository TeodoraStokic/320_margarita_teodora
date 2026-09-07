package D2;

import java.util.ArrayList;

public class Flug {

  ArrayList<Passagier> passagiere = new ArrayList<>();

  public void passagierHinzufuegen(Passagier p) {

    passagiere.add(p);

  }

  public void passagierListeAusgeben() {

    for (Passagier p : passagiere) {

      p.nameAusgeben();

    }

  }

  public void passagierEntfernen(String name) {

    for (int i = 0; i < passagiere.size(); i++) {

      if (passagiere.get(i).name.equals(name)) {

        passagiere.remove(i);

        System.out.println("Passagier entfernt!");

        return;

      }

    }

    System.out.println("Passagier nicht gefunden!");

  }

}
