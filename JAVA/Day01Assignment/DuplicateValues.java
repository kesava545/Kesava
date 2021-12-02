package com.sonata;

public class DuplicateValues
{
	public static void main(String atgs[])
	{
		int array[]= {1,2,3,4,3,5,6,5};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[j]);
				}
			}
		}
	}

}
