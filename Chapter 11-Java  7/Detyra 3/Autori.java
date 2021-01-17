//1.1. Definoni klasën Autori e cili ka id (int), emrin dhe mbiemrin.

public class Autori {
    private int Id;
    private String Emri;
    private String Mbiemri;
    // a) Ofroni konstruktorin e kësaj klase (Të inicializohen të gjitha atributet)

    public Autori(int id, String emri, String mbiemri) {
        id = Id;
        Emri = emri;
        Mbiemri = mbiemri;
    }
    // b) Ofroni metodat set/get. Veni re: id është readOnly

    public int getId() {
        return Id;
    }

    public String getmbiemri() {
        return Mbiemri;
    }

    public String getemri() {
        return Emri;
    }

    public void setmbiemri(String mbiemri) {
        Mbiemri = mbiemri;
    }

    public void setemri(String emri) {
        Emri = emri;
    }
    // c) Mbishkruani metodat equals dhe toString.

    @Override
    public String toString() {

        return Id + ":" + Emri + " " + Mbiemri;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Autori)) {
            return false;
        }
        Autori l = (Autori) o;

        return this.Id == l.Id;

    }

}
