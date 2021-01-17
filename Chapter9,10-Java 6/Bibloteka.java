//Krijoni klasën Biblioteka që ka një emër dhe ka libra të ndryshëm: 

public class Bibloteka {
    private String emriBibloteka;
    private Libri[] librat;
    private int index = 0;
    // d) Një bibliotekë mund të ketë 150 libra (nuk duhet te deklarohet si
    // konstante).
    private static int NrLibrave;
    {
        int Librat = 150;
    }

    // Në konstruktorin pranohet emri i bibliotekes.
    public Bibloteka(String EmriBibloteka) {
        this.emriBibloteka = EmriBibloteka;
    }
    // Klasa e brendshme (ang. Inner class) Romani është një Libër, ka zhanrin, s’ka
    // detyra, reprezentohet në String si

    class Inner_Romani extends Libri {
        String zhanri;

        public Inner_Romani(String Zhanri, int i, String t, int vP)

        {
            super(i, t, vP);
            this.zhanri = Zhanri;
        }

        @Override
        public boolean kaDetyra() {

            return false;
        }

        @Override
        public String toString() {
            return "Romani i zhanrit:" + isbn + ": " + titulli + "- " + vitiPublikimit;
        }
    }
    // c) Klasa e ndërthurur (ang. static nested class) Fjalori është një Libër, ka
    // numër fjalësh, s’ka detyra, reprezentohet në String si:

    static class Fjalori extends Libri {
        int nrFjaleve;

        public Fjalori(int NrFjaleve, int i, String t, int vP) {
            super(i, t, vP);
            this.nrFjaleve = NrFjaleve;

        }

        @Override
        public boolean kaDetyra() {

            return false;
        }

        @Override
        public String toString() {
            return "Fjalori" + isbn + ": " + titulli + "- " + vitiPublikimit + "me" + nrFjaleve + "fjale";
        }
    }
    // e) Çdo Bibliotekë e ka një fjalor shqip – shqip me 570 fjalë, isbn = 11111 i
    // publikuar më 2005

    {
        librat = new Libri[NrLibrave];
        librat[index++] = new Bibloteka.Fjalori(585, 12345, "Fjalori anglisht-shqip", 2020);
    }

    // Metoda ekziston tregon nëse një libër gjendet në bibliotekë
    public boolean ekziston(Libri l) {
        if (l == null) {
            System.out.println("Libri nuk eshte inicializuar!");
            return false;
        }
        for (int i = 0; i < index; i++) {
            if (librat[i].equals(l))
                return true;
        }
        return false;
    }

    // g) Metoda shtoLibrin e shton një libër në array nëse nuk ekziston dhe ka vend
    // në array
    public void shtoLibrin(Libri l) {
        if (l == null) {
            System.out.println("Libri nuk eshte inicializuar!");
            return;
        }
        if (index == librat.length) {
            System.out.println("Nuk ka vend ne varg!");
            return;
        }
        if (ekziston(l)) {
            System.out.println("Libri ekziston ne varg!");
            return;
        }
        librat[index++] = l;
    }

    //
    public static void main(String[] args) {
        Bibloteka bibloteka = new Bibloteka("Universum Library");
        LibriShkollor libriShkollor = new LibriShkollor(45342, "Anglia", 2012, "Gjuhe Gjermane");
        bibloteka.shtoLibrin(libriShkollor);
    }
}
