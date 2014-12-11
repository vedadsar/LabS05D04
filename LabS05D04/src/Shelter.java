
public class Shelter {
    private String imeSklonista;
	private Animal[] animals;
	private int numAnimals;
    public static int brojac; // Staticna vrijednost ukupnog broja.
	
	public Shelter(){
		this.imeSklonista= "unknown";
		animals = new Animal[2];
		numAnimals=0;
		brojac = 0;
	}
	
	public Shelter(String imeSklonista){
		this.imeSklonista= imeSklonista;
		animals = new Animal[2];
		numAnimals=0;
	}
	
	
	public void addAnimal(String name, String type, int numlegs){
		
		animals[numAnimals] = new Animal(name, type, numlegs);
		numAnimals++;
		brojac++;
		if(numAnimals == animals.length){
		resizeAnimals();	
		}
	}
	public void resizeAnimals() {
		
		int newLenght = 2*animals.length;
		Animal[] temp = new Animal[newLenght];
		
		for(int i=0; i< animals.length;i++){
			temp[i] = animals[i];
		}
		
		animals = temp;
		
	}

	public void addAnimal(String name, String type){
		
		addAnimal(name,type, 5);
		
		//animals[numAnimals] = new Animal(name, type);
		//numAnimals++;
	}
	
	public String toString(){
		
		String shelterToString ="";
				
		System.out.println("U sklonistu " +this.imeSklonista +" nalaze se: ");
		
		for(int i=0; i<numAnimals;i++){
			shelterToString += animals[i].toString();
			
		}
		return shelterToString;
	}
	
}
