package org.inter;

public class Ktm implements Bike {

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("bike cost");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
	System.out.println("bike speed");	
	}
public static void main(String[] args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
}
}
