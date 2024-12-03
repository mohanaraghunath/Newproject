package com.employeedemo.Employee.emprepository;

import com.employeedemo.Employee.empmodel.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Long> {

}
