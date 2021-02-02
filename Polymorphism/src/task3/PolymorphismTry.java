package task3;
class car {
	public void sounds() {
		System.out.println("Vroom");//yes this is how a car sounds
	}
}
class bird extends car {
	public void sounds() {
		System.out.println("Tweet");
	}
}
class revolver extends car{
	public void sounds() {
		System.out.println("Bang");
	}
}
public class PolymorphismTry {

	public static void main(String[] args) {
		revolver r =new revolver();
		bird b = new bird();
		car c = new car();
		r.sounds();
		b.sounds();
		c.sounds();
		

	}

}
