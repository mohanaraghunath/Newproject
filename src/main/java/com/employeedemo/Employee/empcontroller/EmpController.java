package com.employeedemo.Employee.empcontroller;

import com.employeedemo.Employee.empmodel.Employee;
import com.employeedemo.Employee.empservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

//    @GetMapping("/view")
//    public List<Employee> viewemployee()
//    {
//        return empService.viewEmployee();
//    }
    @PostMapping("/insert")
    public Employee insert(@RequestBody Employee employee)
    {

        return  empService.viewEmployee(employee);
    }

    //checking

}
