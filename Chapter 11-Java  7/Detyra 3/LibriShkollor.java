//1.4.Krijoni klasën konkrete LibriShkolor që është një Libër dhe botohet, dhe ka atributin drejtimi.

public class LibriShkollor extends Libri implements Botohet {
	private String drejtimi;

	public LibriShkollor(int i, String t, int nrA, String drejtimi) {
		super(i, t, nrA);
		this.drejtimi = drejtimi;
	}

	// a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme

	public String getDrejtimi() {
		return drejtimi;
	}

	public void setDrejtimi(String drejtim) {
		this.drejtimi = drejtim;
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
		for (int i = 0; i < index; i++) {
			if (autoret[i].equals(a)) {
				System.out.println("Libri e ka kete autor!");
				return;
			}
		}
		autoret[index++] = a;
	}
	// b) Libri Shkollor nuk ka kopertina te trasha dhe ka ushtrime

	public boolean kaKopertina() {
		return false;
	}

	public boolean kaUshtrime() {
		return true;
	}
	// c) Ofroni metodën që reprezenton në String një Libër Shkolor në formatin:

	public String toString() {
		return "Libri Shkollor " + super.toString() + " : " + drejtimi;
	}
}
