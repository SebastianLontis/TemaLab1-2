public class Elev {

    private String Name;
    private Gen gen;

    public Elev(String Name, Gen gen) {
        this.Name = Name;
        this.gen = gen;
    }

    public String getName() {
        return Name;
    }

    public Gen getGen() {
        return gen;
    }
}