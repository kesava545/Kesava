package com.sonata.jobtracker.model;

import java.util.Date;

public class Task 
{
private int TaskId;
private int OwerId;
private int CreaterId;
private String Name;
private String Description;
private String Status;
private String Priority;
private String Notes;
private Boolean IsBookMarked;
private Date CretaedOn;
private Date StatusChangedOn;
public int getTaskId() {
	return TaskId;
}
public void setTaskId(int taskId) {
	TaskId = taskId;
}
public int getOwerId() {
	return OwerId;
}
public void setOwerId(int owerId) {
	OwerId = owerId;
}
public int getCreaterId() {
	return CreaterId;
}
public void setCreaterId(int createrId) {
	CreaterId = createrId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public String getPriority() {
	return Priority;
}
public void setPriority(String priority) {
	Priority = priority;
}
public String getNotes() {
	return Notes;
}
public void setNotes(String notes) {
	Notes = notes;
}
public Boolean getIsBookMarked() {
	return IsBookMarked;
}
public void setIsBookMarked(Boolean isBookMarked) {
	IsBookMarked = isBookMarked;
}
public Date getCretaedOn() {
	return CretaedOn;
}
public void setCretaedOn(Date cretaedOn) {
	CretaedOn = cretaedOn;
}
public Date getStatusChangedOn() {
	return StatusChangedOn;
}
public void setStatusChangedOn(Date statusChangedOn) {
	StatusChangedOn = statusChangedOn;
}


}
