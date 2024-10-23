public class Main {
    public static void main(String[] args) {
        Scoala scoala = new Scoala();

        Clasa clasa1A = new Clasa(30, NumarClasa.I, 'A');
        Clasa clasa2B = new Clasa(25, NumarClasa.II, 'B');

        scoala.adaugaClasa("1A", clasa1A);
        scoala.adaugaClasa("2B", clasa2B);

        Elev elev1 = new Elev("Edi", Gen.Masculin);
        Elev elev2 = new Elev("Nao", Gen.Feminin);
        Elev elev3 = new Elev("Andrei", Gen.Masculin);

        scoala.adaugaElevInClasa("1A", elev1);
        scoala.adaugaElevInClasa("1A", elev2);
        scoala.adaugaElevInClasa("2B", elev3);

        System.out.println("Număr de clase: " + scoala.getNumarClase());
        System.out.println("Număr total de elevi: " + scoala.getTotalElevi());

        scoala.eliminaElevDupaNume("Maria");

        System.out.println("Număr total de elevi după eliminare: " + scoala.getTotalElevi());

        scoala.eliminaClasa("2B");

        System.out.println("Număr de clase după eliminare: " + scoala.getNumarClase());
        System.out.println("Număr total de elevi după eliminarea unei clase: " + scoala.getTotalElevi());
    }
}
