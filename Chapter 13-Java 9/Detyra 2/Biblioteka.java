public class Biblioteka {

	private String emri;
	private Libri[] librat;
	private int index = 0;

	public Biblioteka(String e, int nrLibrave) {
		emri = e;
		librat = new Libri[nrLibrave];
	}
	// b) Ofroni metodën ekziston e cila tregon nëse një libër gjendet në
	// bibliotekë. Libri ti dërgohet metodës si parametër.

	public boolean ekziston(Libri l) {
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
	// c) Ofroni metodën shtoLibrin që e shton një libër në bibliotekë nëse ai veq
	// se nuk ekziston.

	public void shtoLibrin(Libri l) {
		if (l == null) {
			System.out.println("Libri nuk eshte inicializuar!");
			return;
		}
		if (index == librat.length) {
			System.out.println("Nuk ka vend ne varg!");
			return;
		}
		if (ekziston(l)) {
			System.out.println("Libri ekziston ne varg!");
			return;
		}
		librat[index++] = l;
	}
	// d) Ofroni metodën maxNumriAutoreve që e kthen enciklopedinë më numrin më të
	// madh të autorëve.

	public Enciklopedia maxNumriAutoreve() {
		if (index == 0) {
			System.out.println("Nuk ka asnje liber ne varg!");
			return null;
		}
		Enciklopedia temp = null;
		for (int i = 0; i < index; i++) {
			if (librat[i] instanceof Enciklopedia) {
				Enciklopedia e = (Enciklopedia) librat[i];
				if (temp == null || temp.getNrAutoreve() <= e.getNrAutoreve())
					temp = e;
			}
		}
		if (temp == null)
			System.out.println("Nuk ka asnje Enciklopedi ne varg!");
		return temp;
	}
	// e) Ofroni metodën shtypDrejtimin që e shtyp / afishon librat shkollor që e
	// kanë një drejtimi të caktuar. Drejtimi ti dërgohet metodës si parametër.

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

	public static void main(String[] args) {
		Biblioteka b = new Biblioteka("Library", 50);
		LibriShkollor l1 = new LibriShkollor(12345, "Java 1", 2, "SHKI 1");
		b.shtoLibrin(l1);
		Enciklopedia e1 = new Enciklopedia(145, "Astronomia", 4, 100);
		b.shtoLibrin(e1);

		System.out.println("maxNumriAutorve:\n" + b.maxNumriAutoreve());
		System.out.println();
		System.out.println("Drejtimi \"SHKI 1\":\n" + b.libriDrejtimit("SHKI 1"));

	}
}