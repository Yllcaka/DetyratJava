//Krijoni klasën konkrete Enciklopedia që është një Libër, dhe ka atributin nrAutoreve.

public class Enciklopedia extends Libri {

	private int nrAutoreve;

	public Enciklopedia(int i, String t, int vP, int nrA) {
		super(i, t, vP);
		nrAutoreve = nrA;
	}

	// a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme

	public int getNrAutoreve() {
		return nrAutoreve;
	}

	public void setNrAutoreve(int nrA) {
		nrAutoreve = nrA;
	}

	// b) Një enciklopedi nuk ka përmbedhje detyrash
	public boolean kaDetyra() {
		return false;
	}

	// c) Ofroni metodën që reprezenton në String një Enciklopedi në formatin:
	public String toString() {
		return "Enciklopedia " + super.toString() + " ka " + nrAutoreve + " autor";
	}

}