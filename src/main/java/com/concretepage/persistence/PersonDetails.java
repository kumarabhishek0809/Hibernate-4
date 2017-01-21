package com.concretepage.persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class PersonDetails implements Serializable {
	@Id
	@GenericGenerator(name = "personDetailsIDGenerator", strategy = "foreign", parameters = {
			@Parameter(value = "person", name = "property") })
	private int personDetailID;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Person person;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getPersonDetailID() {
		return personDetailID;
	}

	public void setPersonDetailID(int personDetailID) {
		this.personDetailID = personDetailID;
	}
}
