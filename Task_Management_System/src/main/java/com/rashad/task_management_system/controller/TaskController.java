package com.rashad.task_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rashad.task_management_system.entity.Task;
import com.rashad.task_management_system.service.TaskService;

@RestController
public class TaskController {
	
	@Autowired
	TaskService service;
	
	@PostMapping("/task")
	public String addTask(@RequestBody Task task) {
		return service.addTask(task);
	}
	
	
	@GetMapping("/task")
	public List<Task> getAllTask(){
		return service.getAllTask();
	}
	
	@GetMapping("/task/{id}")
	public Task getTaskById(@PathVariable int id) {
		return service.getTaskById(id);
	}
	
	@PutMapping("/task/{id}")
	public String updateById(@PathVariable int id,@RequestBody Task task) {
		return service.updateById(id,task);
	}
	
	@DeleteMapping("/task/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
	
	
	@DeleteMapping("/task")
	public String deleteAll() {
		return service.deleteAll();
	}
	
	

}
