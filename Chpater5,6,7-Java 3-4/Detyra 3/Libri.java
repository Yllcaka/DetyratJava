public class Libri {
    public int isbn;
    public String titulli;
    public int vitiPublikimit;

    // a)Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të
    // gjitha atributet.
    public Libri(int i, String t, int vP) {
        isbn = i;
        titulli = t;
        vitiPublikimit = vP;
    }

    // b) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
    public int getIsbn() {
        return isbn;
    }

    public String getTitulli() {
        return titulli;
    }

    public int getvitiPublikimit() {
        return vitiPublikimit;
    }

    public void setTitulli(String t) {
        titulli = t;
    }

    public void setVitiPublikimit(int vP) {
        vitiPublikimit = vP;
    }

    // c) Ofroni metodën që reprezenton në String një objekt të klasës Libri në
    // formatin: isbn : titulli – vitiPublikimit

    @Override
    public String toString() {
        return isbn + ": " + titulli + "- " + vitiPublikimit;
    }
    // Ofroni metodën për krahasimin e dy objekteve Libri.
    // Dy libra janë të njejtë nëse kanë isbn të njejtë

    public boolean LibriInjejte(Libri l) {
        return this.isbn == l.isbn;
    }
}