
	package com.sonata.jobtracker.dao;
	import java.sql.SQLException;
	import java.util.List;

	import com.sonata.jobtracker.model.Task;

	public interface JobTrackerDao 
	{
		public boolean addTask(Task task) throws SQLException;
		public List<Task> getAllTasks() throws SQLException;
		public List<Task> getAllTasksByStatus(String status) throws SQLException;
		public List<Task> getAllTasksByOwner(String status) throws SQLException;
		public int updateTaskStatus(int taskid, String status);
		public int updateTaskPriority(int taskid, String priority);
		public int updateTaskNotes(int taskid, String Notes);
		public int assignTaskUser(int taskid, int ownerid);
		boolean addTask1(Task task) throws SQLException;
		
		

	}