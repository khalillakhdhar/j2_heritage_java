package classes;

public class Ordinateur {
private String cpu,marque;
private int ram,disque;
private String cartegraphique;
private float prix;
public String getCpu() {
	return cpu;
}
public void setCpu(String cpu) {
	this.cpu = cpu;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public int getDisque() {
	return disque;
}
public void setDisque(int disque) {
	this.disque = disque;
}
public String getCartegraphique() {
	return cartegraphique;
}
public void setCartegraphique(String cartegraphique) {
	this.cartegraphique = cartegraphique;
}
public float getPrix() {
	return prix;
}
public void setPrix(float prix) {
	this.prix = prix;
}
public Ordinateur() {
	super();
}
public Ordinateur(String cpu, String marque, float prix) {
	super();
	this.cpu = cpu;
	this.marque = marque;
	this.prix = prix;
}
public Ordinateur(String cpu, String marque, int ram, int disque, String cartegraphique, float prix) {
	super();
	this.cpu = cpu;
	this.marque = marque;
	this.ram = ram;
	this.disque = disque;
	this.cartegraphique = cartegraphique;
	this.prix = prix;
}
@Override
public String toString() {
	return "Ordinateur [cpu=" + cpu + ", marque=" + marque + ", ram=" + ram + ", disque=" + disque + ", cartegraphique="
			+ cartegraphique + ", prix=" + prix + "]";
}








}
