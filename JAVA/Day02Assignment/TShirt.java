package com.sonata;

public class TShirt
{
	String color;
	String material;
	String design;
	public void display()
	{
		System.out.println(color);
		System.out.println(material);
		System.out.println(design);
		
		}
	public static void main(String args[])
	{
		System.out.println("small size ");
		TShirt small=new TShirt();
		small.color="pink";
		small.material="cotton";
		small.design="plain";
		small.display();
		
        System.out.println("Large size  ");
		TShirt large=new TShirt();
		large.color="black";
		large.material="cotton";
		large.design="neck ness";
		large.display();
		
		System.out.println("xtra large ");
		TShirt Xtralarge=new TShirt();
		Xtralarge.color="white";
		Xtralarge.material="cotton";
		Xtralarge.design="with neck";
		Xtralarge.display();
		
	}

}

