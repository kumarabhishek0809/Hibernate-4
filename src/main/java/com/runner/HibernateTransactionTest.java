package com.runner;

import com.hibernate.domain.Address;
import com.hibernate.domain.Department;
import com.hibernate.domain.Employee;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

public class HibernateTransactionTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Address address = new Address();
        Set<Address> address1 = new HashSet<>();
        address1.add(address);
        employee.setAddress(address1);
        address.setEmployee(employee);
        Department department = new Department();
        Set<Department> department1 = new HashSet<>();
        department1.add(department);
        employee.setDepartment(department1);
        department.setEmployee(employee);
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();
        System.out.println("Done");
    }
}
