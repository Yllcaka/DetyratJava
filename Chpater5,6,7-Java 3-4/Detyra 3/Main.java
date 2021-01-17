public class Main {

    public static void main(String[] args) {
        Libri l1 = new Libri(1, "Libri1", 2001);
        Libri l2 = new Libri(2, "Libri 2 ", 2002);
        Libri l3 = new Libri(3, "Libri 3 ", 2020);
        Libri l4 = new Libri(4, "Libri 4 ", 2002);
        LibriShkollor l5 = new LibriShkollor(4, "Matematika XI ", 2008, "ShK");

        String libri1 = l1.toString();
        String libri2 = l2.toString();
        String libri3 = l3.toString();
        String libri4 = l4.toString();

        System.out.println(l1.LibriInjejte(l2));
        System.out.println(l5.toString());
        Bibloteka bibloteka = new Bibloteka("Library", 2);
        LibriShkollor libriShkollor = new LibriShkollor(12, "Prometeu", 2001, "Shkenca kompjuterike");
        bibloteka.shtoLibrin(libriShkollor);
        bibloteka.libriDrejtimit("Shkenca kompjuterike");
        System.out.println("Drejtimi \"SHKI 1\":\n" + bibloteka.libriDrejtimit("SHKI 1"));
    }

}
