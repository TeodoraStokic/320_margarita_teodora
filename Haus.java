import java.util.ArrayList;
import java.util.List;

public class Haus {
  private List<Raum> raeume;

  public Haus() {
    this.raeume = new ArrayList<>();
  }

  public void addRaum(Raum raum) {
    raeume.add(raum);
  }

  public void removeRaum(Raum raum) {
    raeume.remove(raum);
  }

  public List<Raum> getRaeume() {
    return raeume;
  }
}
