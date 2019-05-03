package com.qa.Boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.Boot.model.Task;

public interface TasksRepository extends JpaRepository<Task,Integer> {

}
