package edu.seg2105.assignment1.exercise2.entities;

public class TeachingAssistant extends Instructor {
	private int max_courses = 3;

	public TeachingAssistant(String firstName, String lastName, String id, double salary) {
		super(firstName, lastName, id, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean assignCourse(Course course) {
		if (courses.size() < max_courses) {
			courses.add(course);
			return true;
		} else {
			return false;
		}
	}
	
	/**
     * Returns a string representation of the TA's information.
     *
     * @return the string representation of the TA
     */
	
	 public String toString() {
	    	
	        return "TA information:\n"
	                + "\tFirst name: " + getFirstName() + "\n"
	                + "\tLast name: " + getLastName() + "\n"
	                + "\tEmployee ID: " + getId() + "\n"
	                + "\tSalary: " + getSalary() + "\n"
	                + (courses.size() > 0 ? "\tList of assigned courses:" + getCoursesTable() : "");

	 }
}
