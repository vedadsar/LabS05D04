
public class Student {

	private String imeIPrezime;
	private Datum datumRodjenja;
	private Datum datumUpisa;
	private double gpa;
	private int brIndexa;
	
	private static int brStudenata = 0;
	
	//public Student(){
		
		//this.imeIPrezime = "Vedad Zornic";
		//this.datumRodjenja = new Datum();
		//this.datumUpisa = new Datum();
		
		//brStudenata++;
		//brIndexa=brStudenata;
		
	//}
	
	//Prazan konstruktor
	public Student(){
		this("Vedad Zornic",new Datum(), new Datum());
	}
	
	//Konstruktor koji prima varijable.
	public Student(String imeIPr, Datum datR, Datum datU){
		this.imeIPrezime=imeIPr;
		this.datumRodjenja=datR;
		this.datumUpisa=datU;
		this.gpa=0;
		brStudenata++;
		brIndexa=brStudenata;
	}
	// Konstruktor kopija...
	public Student(Student other){
		this.imeIPrezime=other.imeIPrezime;
		this.datumRodjenja=other.datumRodjenja;
		this.datumUpisa=other.datumUpisa;
		this.gpa=other.gpa;
		this.brIndexa=other.brIndexa;
	}
	
}
