package com.sonata.jobtracker;

import java.util.List;

import com.sonata.jobtracker.dao.impl.JobTrackerDaoImpl;
import com.sonata.jobtracker.model.Task;

public class Main {

	public static void main(String[] args) 

	{
       Task t1=new Task();
		
		t1.setTaskId(2);
		t1.setName("shyam");
		//t1.setOwnerId(29000);
		
	
		JobTrackerDaoImpl dao=new 	JobTrackerDaoImpl();
		//int row=dao.save(Task);
		System.out.println(row);
		//List<Task>list=dao.getData();
		for(Task t:list)
		{
			System.out.println(t1.getTaskId());
			System.out.println(t1.getName());
			
		}

	}

}
