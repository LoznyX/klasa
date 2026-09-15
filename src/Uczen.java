public class Uczen extends  Osoba implements dyzurny{

    private int nrUcznia;
    private static int LiczbaUczniow = 0;

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        LiczbaUczniow++;
        nrUcznia = LiczbaUczniow;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "Imie" + getImie() +
                "wiek" + getWiek() +
                "nrUcznia=" + nrUcznia +
                '}';
    }

    @Override
    public void wykonajWyzur() {

    }
}



