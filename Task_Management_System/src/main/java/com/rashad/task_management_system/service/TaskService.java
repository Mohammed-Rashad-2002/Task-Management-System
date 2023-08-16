package com.rashad.task_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rashad.task_management_system.dao.TaskDao;
import com.rashad.task_management_system.entity.Task;

@Service
public class TaskService {

	@Autowired
	TaskDao dao;

	public String addTask(Task task) {
		return dao.addTask(task);
	}

	public List<Task> getAllTask() {
		return dao.getAllTask();
	}

	public Task getTaskById(int id) {
		return dao.getTaskById(id);
	}

	public String updateById(int id, Task task) {
		if (!(task == null)) {
			return dao.updateById(id, task);
		}
		return null;
	}

	public String deleteById(int id) {

		return dao.deleteById(id);
	}
	
	public String deleteAll() {
		return dao.deleteAll();
	}

}
