package com.qa.Boot.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qa.Boot.model.Task;
import com.qa.Boot.repository.TasksRepository;

@RestController
@RequestMapping("api/v1/")
public class TasksController {

	@Autowired
	private tasksRepository tasksRepository;

	@RequestMapping(value = "tasks", method = RequestMethod.GET)
    public List<Task> list(){
        return tasksRepository.findAll();
    }
	
	@RequestMapping(value = "tasks/{id}", method = RequestMethod.GET)
    public Task get(@PathVariable Integer id){
        return tasksRepository.findOne(id);
    }

	@RequestMapping(value = "tasks/{id}", method = RequestMethod.DELETE)
    public Task delete(@PathVariable Integer id){
        Task existingTask = tasksRepository.findOne(id);
        tasksRepository.delete(existingTask);
        return existingTask;
    }

	@RequestMapping(value = "tasks/{id}", method = RequestMethod.PUT)
    public Task update(@PathVariable Integer id, @RequestBody Task task){
        Task existingTask = tasksRepository.findOne(id);
        BeanUtils.copyProperties(task, existingTask);
        return tasksRepository.saveAndFlush(task);
    }
	
	@RequestMapping(value = "tasks", method = RequestMethod.POST)
    public Task create(@RequestBody Task task){
        return tasksRepository.saveAndFlush(task);
    }



}
