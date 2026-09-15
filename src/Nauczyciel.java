public class Nauczyciel extends Osoba implements dyzurny{
    private String przedmiot;

    public Nauczyciel(String imie, String przedmiot) {
        super(imie);
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "imie" +getImie()+
                "przedmiot='" + przedmiot + '\'' +
                '}';
    }

    @Override
    public void wykonajWyzur() {

    }
}
