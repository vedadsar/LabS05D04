public class Animal {

	private String ime;
	private String type;
	private int brojNogu;

	// Default konstruktor
	public Animal() {
		// this("nepoznato", "nepoznato", 0); Laksa verzija ovog ispod...

		this.ime = "nepoznato";
		this.type = "nepoznata";
		this.brojNogu = 0;
	}

	// Konstruktor sa vrijednostima.
	public Animal(String ime, String tip, int brojNogu) {

		this.setName(ime);
		this.setType(tip);
		this.setLegsNum(brojNogu);

	}

	// Konstruktor na osnovu kojeg mi odredjujemo broj nogu.
	public Animal(String name, String type) {
		this.ime = name;
		this.type = type;

		if (type.equalsIgnoreCase("pas") || type.equalsIgnoreCase("konj")
				|| type.equalsIgnoreCase("macka"))
			this.brojNogu = 4;
		if (type.equalsIgnoreCase("riba"))
			this.brojNogu = 0;
		if (type.equalsIgnoreCase("Ptica"))
			this.brojNogu = 2;

	}

	// Nas objekat u string, ispisuje vrijednosti.
	public String toString() {
		String animalString = "Ime; " + ime + "\nVrsta: " + type
				+ "\nBrojNogu: " + brojNogu +"\n";

		return animalString;
	}

	/**
	 * Klasa setter, provjerava broj nogu i ukoliko broj nogu nije ispravan
	 * vraca novu vrijednost ili exepction
	 * 
	 * @param legsNum
	 *            neki broj nogu
	 * @return exeption ili ispravan broj nogu.
	 */
	public void setLegsNum(int legsNum) {
		if (type.equalsIgnoreCase("pas") || type.equalsIgnoreCase("macka")
				|| type.equalsIgnoreCase("konj")) {
			if (legsNum > 4) {
				legsNum = 4;
			}
			if (legsNum < 1)
				throw new IllegalArgumentException(
						"Broj nogu ne moze biti manji od 1");

		}

		if (type.equalsIgnoreCase("riba")) {
			if (legsNum > 0)
				legsNum = 0;
		}

		if (type.equalsIgnoreCase("ptica")) {
			if (legsNum < 1 || legsNum > 2)
				legsNum=2;

		}
		this.brojNogu = legsNum;

	}

	public int getLegsNum(int legsNum) {
		return legsNum;
	}

	public void setName(String name) {
		this.ime = name;
	}

	public String getName(String name) {
		return name;
	}

	public void setType(String type) {
		if (type.equalsIgnoreCase("konj") || type.equalsIgnoreCase("pas")
				|| type.equalsIgnoreCase("macka")
				|| type.equalsIgnoreCase("riba")
				|| type.equalsIgnoreCase("ptica")){
			this.type=type;
			
		}else{
			throw new IllegalArgumentException("Upisite samo vrstu koju smo odredili");
		}
			
	}

	public String getType(String type) {
		return type;
	}

}
