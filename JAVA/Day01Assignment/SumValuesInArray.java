package com.sonata;

public class SumValuesInArray {
	public static void main (String args[])
	{
		int valArray[]= {1,2,3,4,5,6};
		int b=0;
		{
			for (int a=0;a<6;a++)
			{
				b=b+valArray[a];
			}
			System.out.println("sum of values in a given array is  " +b);
		}
		

}
}
