
    public abstract class Osoba {
        private String imie;
        private int wiek;

    public Osoba(String imie) {
 this.imie = imie;
 wiek=0;
    }

        public int getWiek() {
            return wiek;
        }

        public String getImie() {
            return imie;
        }

        public Osoba(String imie, int wiek) {

    }
}