package com.runner;

import com.hibernate.domain.Address;
import com.hibernate.domain.Department;
import com.hibernate.domain.Employee;
import com.hibernate.manager.IDepartmentManager;
import com.hibernate.manager.IEmployeeManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class SpringTransactionRunnerTest {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring.xml");

        IEmployeeManager employeeManager = (IEmployeeManager) ctx.getBean("employeeManager");


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
        employeeManager.saveEmployee(employee);


        IDepartmentManager departmentManager = (IDepartmentManager) ctx.getBean("departmentManager");
        department.setDepartmentInfo("DepartmentInfoChanged");
        departmentManager.saveDepartment(department);

    }
}
