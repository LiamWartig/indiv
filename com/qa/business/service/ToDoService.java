package com.qa.business.service;

public interface ToDoService {

	public String addToDo(String todo);
	public String getAllToDos();
	public 	String updateToDo(String todo, Long id);
	public String deleteToDo(Long id);
	public	int cycleToDos(String taskDescription);
	public String getAToDo(Long id);
}
