package classes;

public class Laptop extends Ordinateur {

	float autonomie;
	
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String cpu, String marque, float prix) {
		super(cpu, marque, prix);
		// TODO Auto-generated constructor stub
	}

	public Laptop(String cpu, String marque, int ram, int disque, String cartegraphique, float prix) {
		super(cpu, marque, ram, disque, cartegraphique, prix);
		// TODO Auto-generated constructor stub
	}

}
