package com.concretepage.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name = "person")
// Why Hibernate Entity is required to be serializable.
public class Person implements Serializable {
	@Id
	@Column(name = "personID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personID;
	
	@Column(name = "name")
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}
}
