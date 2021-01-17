//1.4.Krijoni klasën Biblioteka që ka atributin emri (String) dhe përmban një array ku do të ruhen si libra shkollor ashtu. 
public class Bibloteka {
    private String emri;
    private int index = 0;
    private Libri[] librat;

    public Bibloteka(String emriIBibliotekes, int numriILibrave) {
        this.emri = emriIBibliotekes;

        librat = new Libri[numriILibrave];
    }

    // b) Ofroni metodën ekziston e cila tregon nëse një libër gjendet në
    // bibliotekë. Libri ti dërgohet metodës si parametër
    public Boolean Ekziston(Libri l) {
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
    // c) Ofroni metodën shtoLibrin që e shton një libër në array

    public void shtoLibrin(Libri l) {
        if (l == null) {
            System.out.println("Libri nuk eshte inicializuar!");
            return;
        }
        if (index >= librat.length) {
            System.out.println("Nuk ka vend ne varg!");
            return;
        }
        if (Ekziston(l)) {
            System.out.println("Libri ekziston ne varg!");
            return;
        }
        librat[index++] = l;
    }

    // d)Ofroni metoden shtyp drejtimin qe shtyp librat Shkollor perms parametrit
    // drejtimi
    public LibriShkollor libriDrejtimit(String d) {
        if (index == 0) {
            System.out.println("Nuk ka asnje liber ne varg!");
            return null;
        }
        LibriShkollor l = null;
        for (int i = 0; i < index; i++) {
            if (librat[i] instanceof LibriShkollor) {
                l = (LibriShkollor) librat[i];
                if (l.getDrejtimi().equals(d))
                    return l;
            }
        }

        System.out.println(l == null ? "Nuk ka asnje Liber Shkollor ne varg!"
                : "Nuk ka asnje Liber Shkollor me kete drejtim ne varg!");

        return l;
    }
}
