package com.qa.persistence.domain;

@Entity
public class ToDo {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	private String taskDescription;
	private boolean status;
	
	public ToDo() {
		
	}
	
	public ToDo(String taskDescription) {
		this.taskDescription=taskDescription;
		this.status=false;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setToDoStatement(String taskDescription) {
		this.taskDescription=taskDescription;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
