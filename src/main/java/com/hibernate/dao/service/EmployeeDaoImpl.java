package com.hibernate.dao.service;

import com.hibernate.dao.EmployeeDAO;
import com.hibernate.domain.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDaoImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveEmployee(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }
}
