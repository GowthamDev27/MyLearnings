package InheritancePractice;

class Fruits{
	void Fnames() {
		System.out.println("Fruit List:");
	}
	
	
}
class Apples extends Fruits{
	void appleKgs() {
		System.out.println("1. Apple 2kgs");
	}
}
class Grapes extends Fruits{
	void grapesKgs() {
		System.out.println("2. Grapes 1kgs");
	}
}

public class HiraricalInhert {

	public static void main(String[] args) {
		Grapes Gobj = new Grapes();
		Apples Aobj = new Apples();
		Gobj.Fnames();
		Aobj.appleKgs();
		Gobj.grapesKgs();

	}

}
