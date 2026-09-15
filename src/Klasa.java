import java.util.ArrayList;

public class Klasa {
    private String nazwa;
    private ArrayList<Uczen> uczniowie;
    private Wychowawca wychowawca;

    public Klasa(Wychowawca wychowawca, String nazwa) {
        this.wychowawca = wychowawca;
        this.nazwa = nazwa;
        uczniowie = new ArrayList<>();
    }
    //dodaj ucznia do klasy
    //usun ucznia z klasy
    //to string -> wypisanie wszystkich uczniow w klasie
    public void dodajUczniaDoKlasy(Uczen uczen) {
        if(uczniowie.contains(uczen)) {
            System.out.println("uczen jest juz w tej klasie");

        }else
        uczniowie.add(uczen);
    }
    public void UsunUcznia(Uczen uczen) {
        if (uczniowie.contains(uczen)) {
            uczniowie.remove(uczen);
        } else {
            System.out.println(uczen + "nie wystepuje w tej klasie");
        }
    }
public void WypiszInfoKlasy(){
    System.out.println("Klasa: "+nazwa);
    System.out.println("wychowawca: "+wychowawca);
    for (Uczen uczen:uczniowie) {
        System.out.println("- "+uczen);
    }
}
    @Override
    public String toString() {
        return "Klasa{" +
                "nazwa='" + nazwa + '\'' +
                ", uczniowie=" + uczniowie +
                ", wychowawca=" + wychowawca +
                '}';
    }
}
