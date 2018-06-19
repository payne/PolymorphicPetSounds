import java.util.*;

public class PolymorphicPetSoundsApp {
  public static void main(String[] arg) {
	  List<Animal> pets = getPets();
		for (Animal pet: pets) {
		  System.out.println(pet.getSound());
		}
	}

	public static List<Animal> getPets() {
		List<Animal> p = new ArrayList<>();
		p.add(new Dog());
		p.add(new Bird());
		p.add(new Cat());
		return p;
	}
}

