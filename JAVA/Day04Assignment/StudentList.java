package com.sonata;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class StudentList extends Student implements Comparable<Student> 
{
	public int  compareTO(Student s1 , Student s2) 
	{
		   if(s1.getMarks() == s2.getMarks())
		   	return 0;
		   else return s1.getMarks() >s2.getMarks()? 1 : -1;
		   }

		   @Override
		   public int compareTo(Student s3) {
		   	// TODO Auto-generated method stub
		   	return 0;
		   }

		   StudentList(String name, int marks) {
		super(name, marks);
		// TODO Auto-generated constructor stub
	}
		   

		public static void main(String[] args) {
			
		      List<Student> studentlist = new ArrayList<Student>();
		      studentlist.add(new Student("shyam", 80)); 
		      studentlist.add(new Student("Siri", 90)); 
		      studentlist.add(new Student("Kesava", 53)); 
		     
		      System.out.println("Before Sorting the student data:"); 
		   
		      studentlist.forEach((s)->System.out.println(s));
		      System.out.println("\n"); 
		     
		      studentlist.sort((Student s1, Student s2)->s2.getMarks()-s1.getMarks());
		      
		      System.out.println("Before Sorting the student data:"); 
				 
		      studentlist.forEach((s)->System.out.println(s));
		      
		      

}


		
}