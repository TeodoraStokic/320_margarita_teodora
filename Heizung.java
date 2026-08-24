public class Heizung {

    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heizung(int temperature, int increment) {
        this.temperature = temperature;
        this.increment = increment;
        this.min = 10;
        this.max = 30;
    }

    public void waermer() {
        if (temperature + increment <= max) {
            temperature += increment;
        } else {
            temperature = max;
            System.out.println("WARNUNG: Maximale Temperatur erreicht!");
        }
    }

    public void colder() {
        if (temperature - increment >= min) {
            temperature -= increment;
        } else {
            temperature = min;
            System.out.println("WARNUNG: Minimale Temperatur erreicht!");
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }
}
