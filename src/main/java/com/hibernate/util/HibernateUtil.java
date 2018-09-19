package com.hibernate.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.hibernate.domain.Address;
import com.hibernate.domain.Department;
import com.hibernate.domain.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	static {
		Configuration configuration = new Configuration().configure();

		// Configure all the classes.

		Set<Class> entityClasses = new HashSet<Class>(Arrays.asList(Address.class, Employee.class, Department.class));
		for (Class cls : entityClasses) {
			configuration.addAnnotatedClass(cls);
		}
		configuration.addPackage("com.hibernate.domain");

		configuration.addPackage("com.hibernate.persistence");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		sessionFactory = configuration.buildSessionFactory(builder.build());
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
