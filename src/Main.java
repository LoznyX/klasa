//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 Osoba osoba = new Uczen("jas",8);
 Uczen uczen = new Uczen("małgosia",7);
        Uczen uczen2 = new Uczen("adam",7);
        Uczen uczen3 = new Uczen("michal",7);
        Uczen uczen4 = new Uczen("lubecki",7);

 uczen.wykonajWyzur();


Wychowawca wychowawca = new Wychowawca("Tadeusz","matematyka");
        System.out.println(osoba);
        System.out.println(uczen);
        Nauczyciel nauczyciel = new Nauczyciel("Joanna","muzyka");
        nauczyciel.wykonajWyzur();
        System.out.println(nauczyciel);

            }
        }

