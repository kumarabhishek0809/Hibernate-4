package com.hibernate.dao.service;

import com.hibernate.dao.DepartmentDAO;
import com.hibernate.domain.Department;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentDAOImpl implements DepartmentDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveDepartment(Department department) {
        sessionFactory.getCurrentSession().save(department);
    }
}
