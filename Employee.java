
/**
 * Constructor overloading example. 
 * 
 * @author Mritunjay Kumar
 */
package com.example;

public class Employee {

	// Create Getter and Setter if required.
	private int id;
	private String name;

	/*
	 * Constructor with one parameter i.e id.
	 */
	public Employee(int id) {
		super();
		this.id = id;
	}

	/*
	 * Constructor with one parameter i.e name.
	 */
	public Employee(String name) {
		super();
		this.name = name;
	}

	/*
	 * Constructor with no parameter.
	 */
	public Employee() {
		super();
	}

	/*
	 * Constructor with two parameter
	 */
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}