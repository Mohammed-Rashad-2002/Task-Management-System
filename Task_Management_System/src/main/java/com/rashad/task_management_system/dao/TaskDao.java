package com.rashad.task_management_system.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rashad.task_management_system.entity.Task;
import com.rashad.task_management_system.repository.TaskRepository;

import jakarta.transaction.Transactional;

@Component
public class TaskDao {

	@Autowired
	TaskRepository repo;

	@Transactional
	public String addTask(Task task) {

		if (task != null) {
			repo.save(task);
			repo.flush();
			return "Added Successfully";
		}
		return "Something wents wrong";
	}

	public List<Task> getAllTask() {
		return repo.findAll();
	}

	public Task getTaskById(int id) {
		return repo.findById(id);
	}

	public String updateById(int id, Task task) {

		repo.deleteById(id);
		repo.save(task);
		return "Successfully Updated";

	}

	public String deleteById(int id) {
		
		repo.deleteById(id);
		return "Successfully Deleted";

	}
	
	public String deleteAll() {
		repo.deleteAll();
		return "Deleted successfully";
	}

}
