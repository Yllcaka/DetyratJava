//1.2.Krijoni klasën konkrete LibriShkolor që është një Libër, dhe ka atributin drejtimi.
public class LibriShkollor extends Libri {
    private String drejtimi;

    public LibriShkollor(int i, String t, int vP, String drejtimi) {
        super(i, t, vP);
        this.drejtimi = drejtimi;

    }

    // a)Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme
    public String getDrejtimi() {
        return drejtimi;
    }

    public void setDrejtimi(String d) {
        drejtimi = d;
    }
    // b) Ofroni metodën që reprezenton në String një objekt të klasës LibriShkolor
    // në formatin: Libri Shkollor <isbn> : <titulli> - <vitiPublikimit> :
    // <drejtimi>

    @Override
    public String toString() {
        return "Libri Shkollor<" + this.isbn + ">:<" + this.titulli + ">-<" + this.vitiPublikimit + ">:<"
                + this.drejtimi + ">";
    }

}
