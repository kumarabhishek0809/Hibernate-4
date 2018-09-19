package com.hibernate.manager;

import com.hibernate.dao.EmployeeDAO;
import com.hibernate.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("employeeManager")
public class EmployeeManager implements IEmployeeManager {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }
}
