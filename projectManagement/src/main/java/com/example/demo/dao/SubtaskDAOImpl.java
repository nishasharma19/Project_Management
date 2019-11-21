package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Subtask;
import com.example.demo.entity.Task;
import com.example.demo.repository.SubTaskRepository;
import com.example.demo.repository.TaskRepository;

@Repository
public class SubtaskDAOImpl implements SubtaskDAO {

	private EntityManager entityManager;
	
	@Autowired
	private SubTaskRepository subtaskRepository;
	
	@Autowired
	private TaskRepository taskRepository;

	public SubtaskDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	/*@Override
	@Transactional
	@Modifying
	public void updateProgress(Long subtaskId) {

		Session currentSession = entityManager.unwrap(Session.class);
		
		Subtask subtask = entityManager.find(Subtask.class, subtaskId);
		Long progressPercentage = subtask.getProgressPercentage();
		
		Query<Subtask> theQuery = currentSession.createQuery("update Subtask set progressPercentage=:updated where subTaskId=:Id").
				setParameter("updated", progressPercentage).setParameter("Id", subtaskId);
				
		theQuery.executeUpdate();
		
		updateTaskProgress(subtaskId, progressPercentage);
		
		
	}
	
	public void updateTaskProgress(Long subtaskId, Long progressPercentage)
	{
		Long totalProgress = 0L;
		
		Subtask subtask = subtaskRepository.findBySubTaskId(subtaskId);
		//System.out.println(subtask);
		Task taskobj= subtask.getTaskId();
		//System.out.println(taskobj);
		Long taskId = taskobj.getTaskId();
		//System.out.println(taskId);
		List<Subtask> subtasks = subtaskRepository.findByTaskId(taskobj);
		//System.out.println(subtasks);
		for(Subtask eachtask : subtasks)
		{
			//System.out.println(eachtask.getProgressPercentage());
			totalProgress = totalProgress + eachtask.getProgressPercentage();
		}
		System.out.println(totalProgress);
		
		Task tasks = entityManager.find(Task.class, taskId);
		Long subtaskcount =  tasks.getSubTaskCount();
		System.out.println(subtaskcount);
		
		Long updatedval = totalProgress/subtaskcount;
		System.out.println(updatedval);
		tasks.setProgress(updatedval);
		
		//Optional <Task> tasks = taskRepository.findById(taskId);
		//System.out.println(tasks);
		//tasks.g
		//for(Task task: tasks)
		
	}
	*/
	public void updateProgress(Long subtaskId, Long progressPercentage) {

		Session currentSession = entityManager.unwrap(Session.class);
		Query<Subtask> theQuery = currentSession.createQuery("update Subtask set progressPercentage=:updated where subTaskId=:Id").
				setParameter("updated", progressPercentage).setParameter("Id", subtaskId);
				
		theQuery.executeUpdate();
		
		updateTaskProgress(subtaskId, progressPercentage);
		
		
	}
	
	public void updateTaskProgress(Long subtaskId, Long progressPercentage)
	{
		Long totalProgress = 0L;
		
		Subtask subtask = subtaskRepository.findBySubTaskId(subtaskId);
		//System.out.println(subtask);
		Task taskobj= subtask.getTaskId();
		//System.out.println(taskobj);
		Long taskId = taskobj.getTaskId();
		//System.out.println(taskId);
		List<Subtask> subtasks = subtaskRepository.findByTaskId(taskobj);
		//System.out.println(subtasks);
		for(Subtask eachtask : subtasks)
		{
			//System.out.println(eachtask.getProgressPercentage());
			totalProgress = totalProgress + eachtask.getProgressPercentage();
		}
		System.out.println(totalProgress);
		
		Task tasks = entityManager.find(Task.class, taskId);
		Long subtaskcount =  tasks.getSubTaskCount();
		System.out.println(subtaskcount);
		
		Long updatedval = totalProgress/subtaskcount;
		System.out.println(updatedval);
		tasks.setProgress(updatedval);
		
		//Optional <Task> tasks = taskRepository.findById(taskId);
		//System.out.println(tasks);
		//tasks.g
		//for(Task task: tasks)
		
	}

	/*
	 * @Override public void getAllSubtasks() { Session currentSession =
	 * entityManager.unwrap(Session.class);
	 * 
	 * long someId=1L; //Query<Subtask> theQuery =
	 * currentSession.createQuery("from Subtask"); Query<Subtask> theQuery =
	 * currentSession.createQuery("from Subtask s where s.taskId =:otherId").
	 * setParameter("otherId", someId);
	 * 
	 * 
	 * List<Subtask> subtasks = theQuery.getResultList();
	 * 
	 * System.out.println(subtasks.toString()); }
	 */

}
