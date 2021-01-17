//1.4.Krijoni klasën konkrete LibriShkolor që është një Libër dhe botohet, dhe ka atributin drejtimi.

public class LibriShkollor extends Libri implements Botohet {
	private String drejtimi;

	public LibriShkollor(int i, String t, int nrA, String d) {
		super(i, t, nrA);
		drejtimi = d;
	}

	// a) Ofroni metodat get dhe set për ato atribute që ju e shihni të nevojshme

	public String getDrejtimi() {
		return drejtimi;
	}

	public void setDrejtimi(String d) {
		drejtimi = d;
	}

	@Override
	public boolean kaDetyra() {

		return true;
	}
	// c) Ofroni metodën që reprezenton në String një Libër Shkolor në formatin:

	public String toString() {
		return "Libri Shkollor " + super.toString() + " : " + drejtimi;
	}

}
