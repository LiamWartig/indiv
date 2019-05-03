package com.qa.persistence.repository;

public interface ToDoRepository {
	
	String createToDo(String todo);
	String getAllToDos();
	String updateToDo(String todo, Long id);
	String deleteToDo(Long id);
	int cycleToDos(String todostatement);
	public String getAToDo(long id);
}
