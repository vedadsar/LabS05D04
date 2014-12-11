public class Datum {

	private int dan;

	private int mjesec;

	private int godina;

	public String toString() {

		String datumKaoString = "";

		datumKaoString = dan + "." + mjesec + "." + godina + ".";

		return datumKaoString;

	}

	// konstruktori:

	public Datum(int postaviDan, int postaviMjesec, int postaviGodinu) {
        
		this.setDan(postaviDan);
		this.setMjesec(postaviMjesec);
		this.setGodina(postaviGodinu);


	}

	public Datum() {

		dan = 1;

		mjesec = 1;

		godina = 1900;

	}

	// geteri:

	/**
	 * 
	 * vraca vrijednost varijable dan
	 * 
	 * @return vraca zadani dan u godini
	 */

	public int getDan() {

		return dan;

	}

	/**
	 * 
	 * vraca vrijednost varijable mjesec
	 * 
	 * @return vraca zadani mjesec u godini
	 */

	public int getMjesec() {

		return mjesec;

	}

	/**
	 * 
	 * vraca vrijednost varijable godina
	 * 
	 * @return vraca zadan godinu
	 */

	public int getGodina() {

		return godina;

	}

	// seteri:

	/**
	 * 
	 * stavlja vrijednost na neku varijablu
	 * 
	 * @param dan
	 *            int zadani dan
	 * 
	 * @return true ili false
	 */

	public boolean setDan(int dan) {

		if (dan < 0 || dan > 31)

			return false;

		else {

			this.dan = dan;

			return true;

		}

	}

	/**
	 * 
	 * stavlja vrijednost na neku varijablu
	 * 
	 * @param mjesec
	 *            int zadani mjesec
	 * 
	 * @return true ili false
	 */

	public boolean setMjesec(int mjesec) {

		if (mjesec < 1 || mjesec > 12)

			return false;

		else {

			this.mjesec = mjesec;

			return true;

		}

	}

	/**
	 * 
	 * stavlja vrijednost na neku varijablu
	 * 
	 * @param godina
	 *            int zadana godina
	 * 
	 * @return true ili false
	 */

	public boolean setGodina(int godina) {

		if (godina < 1900 || godina > 3014)

			return false;

		else {

			this.godina = godina;

			return true;

		}

	}

	// konstruktor kopije:

	/**
	 * 
	 * kopira jedan objekat na drugi
	 * 
	 * @param other
	 *            Datum objekt koji zelimo kopirati
	 */

	public Datum(Datum other) {

		this.dan = other.dan;

		this.mjesec = other.mjesec;

		this.godina = other.godina;

	}

	/**
	 * 
	 * poredi jednakost dva objekta
	 * 
	 * @param other
	 *            Datum objekat sa kojim poredimo
	 * 
	 * @return true ili false
	 */

	public boolean equals(Datum other) {

		if (this.dan == other.dan && this.mjesec == other.mjesec
				&& this.godina == other.godina)

			return true;

		else

			return false;

	}

	/**
	 * 
	 * poredi dva objekta
	 * 
	 * @param other
	 *            Datum objekat sa kojim poredimo
	 * 
	 * @return 1-vece, -1-manje, 0-jednaki
	 */

	public int compareTo(Datum other) {

		if (this.godina == other.godina)

		{

			if (this.mjesec == other.mjesec)

			{

				if (this.dan == other.dan)

				{

					return 0;

				}

				else if (this.dan > other.dan)

					return 1;

				else
					return -1;

			}

			if (this.mjesec == other.mjesec)

			{

				return 0;

			}

			else if (this.mjesec > other.mjesec)

				return 1;

			else
				return -1;

		}

		else if (this.godina > other.godina)

			return 1;

		else
			return -1;

	}

}