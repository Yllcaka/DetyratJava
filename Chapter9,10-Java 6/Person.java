public class Person {
    private String Emer;
    private String MbiEmer;
    private String Puna;

    public Person(String Emer, String MbiEmer) {
        this.Emer = Emer;
        this.MbiEmer = MbiEmer;
        this.Puna = "I pa pune";
    }

    public Person(String Emer, String MbiEmer, String Puna) {
        this.Emer = Emer;
        this.MbiEmer = MbiEmer;
        this.Puna = Puna;
    }

    public String getEmer() {
        return this.Emer;
    }

    public void setEmer(String newEmer) {
        this.Emer = newEmer;
    }

    public String getMbiEmer() {
        return this.MbiEmer;
    }

    public void setMbiEmer(String newMbiEmer) {
        this.MbiEmer = newMbiEmer;
    }

    public String getPuna() {
        return this.Puna;
    }

    public void setPuna(String newPuna) {
        this.Puna = newPuna;
    }

    @Override
    public String toString() {
        return this.Emer + " " + this.MbiEmer + " works as: " + this.Puna;
    }
}
