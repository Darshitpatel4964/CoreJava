package corejava;

/* superclass Bike */
class Bike {
	Bike() {
		System.out.println("Bike Is Created");
	}
}

/* subclass Honda extending the Bike class */
class Honda extends Bike {
	Honda() {
		super();
		System.out.println("Honda Is Created");
	}

}

/* Driver program to SuperConstructor */
public class SuperConstructor {
	public static void main(String[] args) {
		Honda h = new Honda();
	}

}
