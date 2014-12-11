public class TestnaKlasa {
	public static void main(String[] args) {

      Shelter skloniste = new Shelter("Camp 1");
      
      skloniste.addAnimal("pujdo", "pas");
      skloniste.addAnimal("cicko", "macka");
      skloniste.addAnimal("rex", "pas");
      skloniste.addAnimal("mrva", "ptica");
      skloniste.addAnimal("molly", "ptica");

      System.out.println(skloniste.toString());

      
      Shelter skloniste2 = new Shelter("Camp 2");
      
      skloniste2.addAnimal("pujdo", "pas");
      skloniste2.addAnimal("cicko", "macka");
      skloniste2.addAnimal("rex", "pas");
      skloniste2.addAnimal("mrva", "ptica");
      skloniste2.addAnimal("molly", "ptica");

      System.out.println(Shelter.brojac);
      
  

	}
}
