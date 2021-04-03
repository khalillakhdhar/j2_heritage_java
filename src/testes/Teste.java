package testes;

import classes.Laptop;
import classes.Ordinateur;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordinateur o1=new Ordinateur("I5 8G","HP",16, 1024,"AMD Radeon 540", 2450);
		Laptop o2=new Laptop("I7 10G","ASUS",24, 1024,"Gforce GTX", 4000);
		o2.setAutonomie(3);
		
		System.out.println(o1.toString());

	}

}
