//Krijoni klasen abstrakte Libri që ka tri atribute: isbn[readonly], titulli dhe vitiPublikimit: 

public abstract class Libri {
    // Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të
    // gjitha atributet.
    public int isbn;
    public String titulli;
    public int vitiPublikimit;

    public Libri(int i, String t, int vP) {
        isbn = i;
        titulli = t;
        vitiPublikimit = vP;
    }
    // Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme

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

    // Ofroni metodën abstrakte kaDetyra që tregon nëse njëlibër ka përmbedhje
    // detyrash
    public abstract boolean kaDetyra();
    // Ofroni metodën që reprezenton në String një Libër në formatin: isbn : titulli
    // – vitiPublikimit

    @Override
    public String toString() {
        return isbn + ": " + titulli + "- " + vitiPublikimit;
    }
    // Ofroni metodën për krahasimin e dy Librave (Dy libra janë të njejtë nëse kanë
    // isbn të njejtë).

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Libri)) {
            return false;
        }
        Libri l = (Libri) o;

        return this.isbn == l.isbn;

    }
}