package com.hibernate.dao;

import com.hibernate.domain.Department;

import java.util.Set;

public interface DepartmentDAO {
    void saveDepartment(Set<Department> departments);
}
