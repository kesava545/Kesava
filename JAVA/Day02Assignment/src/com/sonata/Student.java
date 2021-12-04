package com.sonata;

public class Student {
	
	
		    int stdid;
			String stdname;
			String stdclass;
			
			Student()
			{
				
			}
			Student(int i,String n,String c)
			{
				this.stdid=i;
				this.stdname=n;
				this.stdclass=c;
			}
			
		 public void display()
			{
				System.out.println(stdid);
				System.out.println(stdname);
				System.out.println(stdclass);
				
			}

		public static void main(String args[])
		{
			Student s = new Student();
			s.stdid = 10;
			s.stdname="shyam";
			s.stdclass="MCA";
			s.display();
		 Student s1 = new Student(11,"kesava","Degree");
		  s1.display();
		}

	}


