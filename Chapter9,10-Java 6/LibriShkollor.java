import java.util.ArrayList;

//Krijoni klasën konkrete LibriShkolor që është një Libër, dhe ka atributin drejtimi
public class LibriShkollor extends Libri {
    private String drejtimi;
    public ArrayList<String> detyrat;

    public LibriShkollor(int i, String t, int vP, String drejtimi) {
        super(i, t, vP);
        this.drejtimi = drejtimi;

    }
    // a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme

    public String getDrejtimi() {
        return drejtimi;
    }

    public void setDrejtimi(String d) {
        drejtimi = d;
    }

    public ArrayList<String> getDetyra() {
        return detyrat;
    }

    public void addDetyr(String detyre) {
        detyrat.add(detyre);
    }

    // b) Një libër shkollor ka përmbedhje detyrash
    @Override
    public boolean kaDetyra() {
        return true;
    }

    // b) Një libër shkollor ka përmbedhje detyrash
    @Override
    public String toString() {
        return "Libri Shkollor<" + this.isbn + ">:<" + this.titulli + ">-<" + this.vitiPublikimit + ">:<"
                + this.drejtimi + ">";
    }

}
