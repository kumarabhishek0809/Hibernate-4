package com.concretepage.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.concretepage.persistence.Person;
import com.concretepage.persistence.PersonDetails;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration().configure();

		// Configure all the classes.

		Set<Class> entityClasses = new HashSet<Class>(Arrays.asList(Person.class, PersonDetails.class));
		for (Class cls : entityClasses) {
			configuration.addAnnotatedClass(cls);
		}

		configuration.addPackage("com.concretepage.persistence");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		sessionFactory = configuration.buildSessionFactory(builder.build());
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
