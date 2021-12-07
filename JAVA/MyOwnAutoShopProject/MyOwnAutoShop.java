package com.sonata;

public class MyOwnAutoShop {
	
	public static void main(String args[])
	{
		Car c = new Car(100,85000,"gray");
		Sedan s = new Sedan(250,95000,"Blue",10);
		Truck t = new Truck(15,75000,"red",2021);
		Ford f = new Ford(15,65000,"black",1998,9);
		
		System.out.println("Car");
		c.display();
		System.out.println("Sale Price of Car:  "+c.getSalePrice());
		System.out.println("\n");
		
		System.out.println("Sedan");
		s.display();
		System.out.println("Sale Price of Sedan:"+s.getSalePrice1());
		System.out.println(s.length);
		System.out.println("\n");
		
		System.out.println("Truck");
		t.display();
		System.out.println("Sale Price of Truck:"+t.getSalePrice2());
		System.out.println("\n");
		
		
		
		System.out.println("Ford");
		f.display();
		System.out.println(f.manufacturerDiscount);
		System.out.println(f.year);
		System.out.println("Sale Price of ford:"+f.getSalePrice());
	}

}


