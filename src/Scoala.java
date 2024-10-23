import java.util.HashMap;
import java.util.Map;

public class Scoala {
    private Map<String, Clasa> clase;

    public Scoala() {
        this.clase = new HashMap<>();
    }

    public void adaugaClasa(String id, Clasa clasa) {
        clase.put(id, clasa);
    }

    public void eliminaClasa(String id) {
        clase.remove(id);
    }

    public void adaugaElevInClasa(String idClasa, Elev elev) {
        Clasa clasa = clase.get(idClasa);
        if (clasa != null) {
            clasa.adaugaElev(elev);
        } else {
            System.out.println("Clasa " + idClasa + " nu există!");
        }
    }

    public void eliminaElevDupaNume(String nume) {
        for (Clasa clasa : clase.values()) {
            clasa.getElevi().removeIf(elev -> elev.getName().equals(nume));
        }
    }

    public int getNumarClase() {
        return clase.size();
    }

    public int getTotalElevi() {
        int total = 0;
        for (Clasa clasa : clase.values()) {
            total += clasa.getTotalElevi();
        }
        return total;
    }
}