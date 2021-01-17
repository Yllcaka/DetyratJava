//1.5.Krijoni klasën konkrete Enciklopedia që është një Libër dhe botohet, dhe ka atributin nrFaqeve.

public class Enciklopedia extends Libri implements Botohet {
	private int nrFaqeve;

	public Enciklopedia(int i, String t, int nrA, int nrF) {
		super(i, t, nrA);
		nrFaqeve = nrF;
	}

	// a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme

	public int getNrFaqeve() {
		return nrFaqeve;
	}

	public void setNrFaqeve(int nrF) {
		nrFaqeve = nrF;
	}

	public void shtoAutorin(Autori a) {
		if (a == null) {
			System.out.println("Autori nuk eshte inicializuar!");
			return;
		}
		if (index == autoret.length) {
			System.out.println("Nuk ka vend ne varg!");
			return;
		}
		if (exists(a)) {
			System.out.println("Libri e ka kete autor!");
			return;
		}
		autoret[index++] = a;
	}

	public boolean exists(Autori a) {
		if (a == null) {
			System.out.println("Autori nuk eshte inicializuar!");
			return false;
		}
		for (int i = 0; i < index; i++)
			if (autoret[i].equals(a))
				return true;
		return false;
	}
	// b) Enciklopedia ka kopertina te trasha dhe nuk ka ushtrime

	public boolean kaKopertina() {
		return true;
	}

	public boolean kaUshtrime() {
		return false;
	}
	// c) Ofroni metodën që reprezenton në String një Enciklopedi në formatin:

	public String toString() {
		return "Enciklopedia " + super.toString() + " ka " + nrFaqeve + " faqe";
	}
}
