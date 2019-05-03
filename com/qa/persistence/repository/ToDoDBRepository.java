package com.qa.persistence.repository;

import com.qa.util.JSONUtil;

@Transactional
@Default

public class ToDoDBRepository implements ToDoRepository {

	@PersistenceContext(unitName= "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	@Override
	public int cycleToDos(String taskDescription) {
		
		Query query = manager.createQuery("Select a FROM todo a");
		Collection<ToDo> todos = (Collection<ToDo>) query.getResultList();
		
		List<ToDo> validList = todos.stream().filter(n -> n.getTaskDescription().equals(taskDescription))
		
		return validList.size();
				
	}
	
	@Override
	public String getAllToDos() {
		Query query = manager.createQuery("Select t FROM Todo t");
		Collection<ToDo> todos = (Collection<ToDo>) query.getResultList();
		return util.getJSONForObject(todos);
	}
	
	@Override
	@Transactional(REQUIRED)
	public string createToDo(String todo) {
		ToDo aToDo = util.getObjectForJSON(todo, ToDo.class);
		manager.persist(aToDo);
		return "{\"message\": \"movie has been successfully added\"}";
	}
	
	@Override
	@Transactional(REQUIRED)
	public String deleteToDo(Long id) {
		ToDo todoinDB = util.getObjectForJSON(getAToDo(id),ToDo.class);
		if(manager.contains(manager.find(ToDo.class,id))) {
			manager.remove(manager.find(Movie.class,id));
		}
		return "{\"message\":\"movie successfully deleted\"}";
	}
	
	@Override
	public String getAToDo(Long id) {
		return util.getJSONForObject(manager.find(ToDo.class,id));
	}
	
	public void setManager(EntityManager manager) {
		this.manager=manager;
	}
	
	public void setUtil(JSONUtil util) {
		this.util=util;
	}
	
	@Override
	public String updateToDo(String todo,Long id) {
		return null;
	}
}
