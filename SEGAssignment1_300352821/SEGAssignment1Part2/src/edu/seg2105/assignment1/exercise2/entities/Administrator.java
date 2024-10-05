package edu.seg2105.assignment1.exercise2.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * The Administrator class represents an administrative employee with specific tasks.
 * Extends the Employee class.
 * 
 * @autor Hussein Al Osman
 */
public class Administrator extends Employee{

	// List of tasks assigned to the administrator
	List<String> tasks;

	/**
	 * Constructs a new Administrator with the given details.
	 * 
	 * @param firstName the first name of the administrator
	 * @param lastName the last name of the administrator
	 * @param id the ID of the administrator
	 * @param salary the salary of the administrator
	 */
	public Administrator(String firstName, String lastName, String id, double salary) {
		super(firstName, lastName, id, salary);
		tasks = new ArrayList<String>();
	}
	
	
	
	/* Adds task to an administrator
	 * @param task the task for the administrator
	*/ 
	public void addTask(String task) {
		tasks.add(task);
	}
	
	
	
	/**
     * Returns a string representation of the administrator's tasks.
     *
     * @return the string representation of the tasks
     */
	private String getTasksList() {
		if (tasks.isEmpty()) {
	        return "\tNo tasks assigned.\n";
	    }
		String taskstring = "";
		for (String task : tasks) {
			taskstring = taskstring + "\t" + task + "\n"; 
		}
		return taskstring;
		
	}
	
	
	
	/**
     * Returns a string representation of the administrator's information.
     *
     * @return the string representation of the administrator
     */
	public String toString() {
		
		
		return "Administrator information:\n"
                + "\tFirst name: " + getFirstName() + "\n"
                + "\tLast name: " + getLastName() + "\n"
                + "\tEmployee ID: " + getId() + "\n"
                + "\tSalary: " + getSalary() + "\n"
                + "\tTasks: " + getTasksList();
		
	}
	
}
