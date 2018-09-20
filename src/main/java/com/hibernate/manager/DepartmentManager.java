package com.hibernate.manager;

import com.hibernate.dao.DepartmentDAO;
import com.hibernate.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("departmentManager")
public class DepartmentManager implements IDepartmentManager{

    @Autowired
    private DepartmentDAO departmentDAO;

    @Override
    @Transactional
    public void saveDepartment(Department department) {
        departmentDAO.saveDepartment(department);
    }
}
