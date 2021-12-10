package com.sonata;
public class Student
{
String Name;
int  Marks;
public String getName() 
{
	return Name;
}

public int getMarks() 
{
	return Marks;
}
Student(String name,int marks)
{
	Name=name;
	Marks=marks;
}
@Override
public String toString()
{
	return "Student [Name=" + Name + ", Marks=" + Marks + "]";
}
}
