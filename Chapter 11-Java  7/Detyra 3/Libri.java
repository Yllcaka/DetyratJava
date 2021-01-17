//1.2.Krijoni klasen abstrakte Libri që ka tri atribute: isbn[readonly], titulli dhe së paku një autorë:

public abstract class Libri {
    private int isbn;
    private String titulli;
    protected Autori[] autoret;
    protected int index = 0;
    // a) Ofroni konstruktorin që pranon që të tri parametrat, ku inicializohen të
    // gjitha atributet.

    public Libri(int i, String t, int nrA) {
        if (nrA < 1) {
            System.out.println("Libri duhet te kete se paku nje autor!");
            System.exit(0);
        }

        isbn = i;
        titulli = t;
        autoret = new Autori[nrA];
    }
    // b) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme

    public int getIsbn() {
        return isbn;
    }

    public String getTitulli() {
        return titulli;
    }

    public Autori[] getAutoret() {
        return autoret;
    }

    public void setTitulli(String t) {
        titulli = t;
    }
    // c) Ofroni metodën abstrakte shtoAutorin që e shton një autor

    public abstract void shtoAutorin(Autori a);
    // d) Ofroni metodën që reprezenton në String një Libër në formatin: isbn :
    // titulli – [autoret]

    @Override
    public String toString() {
        String libriToString = isbn + " : " + titulli + " - [";
        for (int i = 0; i < index; i++) {
            libriToString += autoret[i].toString();
            libriToString += i < index - 1 ? ", " : "]";
        }
        return libriToString;
    }
    // e) Ofroni metodën për krahasimin e dy Librave (Dy libra janë të njejtë nëse
    // kanë isbn të njejtë)

    public boolean equals(Object o) {
        if (o instanceof Libri) {
            return isbn == ((Libri) o).getIsbn();
        }
        return false;
    }
}
