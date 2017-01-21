package com.concretepage;

import org.hibernate.Session;

import com.concretepage.persistence.Person;
import com.concretepage.persistence.PersonDetails;
import com.concretepage.util.HibernateUtil;

public class TestMain {
  public static void main(String[] args) {
	 Person person = new Person();
	 PersonDetails personDetails = new PersonDetails();
	 personDetails.setPerson(person);
	 person.setName("Concretepage");
	 personDetails.setName("Testing One To One");
	 
	 Session session = HibernateUtil.getSessionFactory().openSession();
	 session.beginTransaction();
//	 session.save(personDetails);
//	 session.getTransaction().commit();
	 
	 
	 PersonDetails personDetailsDb = (PersonDetails) session.get(PersonDetails.class, 0);
	 Person person2 = personDetailsDb.getPerson();
	 
	 session.close();
	 
	 System.out.println("Done");
  }
}
