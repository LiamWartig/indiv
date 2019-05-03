package com.qa.business.service;

import javax.inject.Inject;
import org.apache.log4j.Logger;
import com.qa.persistence.repository.ToDoRepository;
import com.qa.persistence.repository.ToDoRepository;

public class ToDoServiceImpl implements ToDoService {

	
	@Inject
	private ToDoRepository repo;
	
	@Override
    public String addToDo(String todo){
        return repo.createToDo(todo);
    }
    public String getAllToDos(){
        return repo.getAllToDos();
    }
    @Override
	public String getAToDo(Long id) {
		return repo.getAToDo(id);	
	}
    @Override
    public String updateToDo(String todo, Long id){
        return repo.updateToDo(todo, id);

    }
    public void setRepo(ToDoRepository repo) {
    	this.repo=repo;
    }
    public String deleteToDo(Long id){
        return repo.deleteToDo(id);
    }
    public int cycleToDos(String taskDescription){
        return repo.cycleToDos(taskDescription);

    }

}
