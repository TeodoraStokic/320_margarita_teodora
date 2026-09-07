public class Raum {
  private String name;
  private Heizung heizung;

  public Raum(String name, Heizung heizung) {
    this.name = name;
    this.heizung = heizung;
  }

  public String getName() {
    return name;
  }

  public Heizung getHeizung() {
    return heizung;
  }

  public void setHeizung(Heizung heizung) {
    this.heizung = heizung;
  }
}
