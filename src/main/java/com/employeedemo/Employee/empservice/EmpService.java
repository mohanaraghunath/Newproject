package com.employeedemo.Employee.empservice;

import com.employeedemo.Employee.empmodel.Employee;
import com.employeedemo.Employee.emprepository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;


    public Employee viewEmployee(Employee employee) {
        return empRepo.save(employee);

    }
}
