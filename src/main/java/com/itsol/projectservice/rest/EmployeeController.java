package com.itsol.projectservice.rest;


import com.itsol.projectservice.dto.EmployeeDto;
import com.itsol.projectservice.dto.IssueDto;
import com.itsol.projectservice.service.Impl.EmployeeServiceImpl;
import com.itsol.projectservice.service.Impl.IssueServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(path = "/api/employee")
@CrossOrigin("*")
public class EmployeeController {

//    @Autowired
//    private EmployeeServiceImpl employeeService;
//
//    @GetMapping(path = "/getEmployeeById/{id}")
////    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
//    public ResponseEntity<Employee> getEmployee(@PathVariable("id") String id) {
//        System.out.println("Fetching employee with id " + id);
//        Employee employee = employeeService.getById(Long.valueOf(id));
//        if (employee == null) {
//            System.out.println("Employee with id : " + id + " not found ");
//            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
//    }
//
//
//    //
//    @GetMapping("")
//    public ResponseEntity<List<EmployeeDto>> listAllEmployee() {
//        List<EmployeeDto> employees = employeeService.getAllEmployee();
//        if (employees == null) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<EmployeeDto>>(employees, null, HttpStatus.OK);
//    }
//
//
//    //Edit Employee
//    @RequestMapping(value = "/employee/{id}", method = RequestMethod.PUT)
//    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
//        System.out.println("Update Employee " + id);
//        Employee currentEmployee = employeeService.getById(id);
//        if (employee == null) {
//            System.out.println("Employee with id :" + id + "not found");
//            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
//        }
//        currentEmployee.setUsername(employee.getUsername());
//        currentEmployee.setPassword(employee.getPassword());
//        currentEmployee.setEmail(employee.getEmail());
//        currentEmployee.setPhone(employee.getPhone());
//        currentEmployee.setSkype(employee.getSkype());
//        currentEmployee.setAddress(employee.getAddress());
//        currentEmployee.setBirthday(employee.getBirthday());
//        currentEmployee.setPosition(employee.getPosition());
//        currentEmployee.setDepartment(employee.getDepartment());
//        currentEmployee.setGraduatedYear(employee.getGraduatedYear());
//        currentEmployee.setImageUrl(employee.getImageUrl());
//        employeeService.save(currentEmployee);
//        return new ResponseEntity<Employee>(currentEmployee, HttpStatus.OK);
//    }
//
//
//    //Create Employee
//    @RequestMapping(value = "/employee", method = RequestMethod.POST)
//    public ResponseEntity<Void> createEmployee
//    (@RequestBody EmployeeDto employee, UriComponentsBuilder uriComponentsBuilder) {
//        System.out.println("Create Employee " + employee.getUsername());
//        employeeService.create(employee);
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setLocation(uriComponentsBuilder.path("/employee/{id}").buildAndExpand(employee.getId()).toUri());
//        return new ResponseEntity<Void>(httpHeaders, HttpStatus.CREATED);
//    }
//
//
    //Delete Employee
//    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<EmployeeDto> deleteEmployee(@PathVariable("id") int id) {
//        System.out.println("Fetching and deleting Employee with id :" + id);
//        EmployeeDto employee = employeeService.getE(id);
//        if (employee == null) {
//            System.out.println("Unable to delete. Employee with id :" + id + "not found");
//            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
//        }
//        employeeService.deleteById(id);
//        return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
//    }
Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private EmployeeServiceImpl employeeService;


    @GetMapping("/getAll")
    ResponseEntity<List<EmployeeDto>> getAllEmployee(){
        logger.trace("REST to request get all issue.");
        return new ResponseEntity<>(employeeService.getAllEmployee(),HttpStatus.OK);
        //tra ve doi tuong ResponseEntity chua du lieu tao ra va httpstatus
    }

    @PostMapping("/create")
    public ResponseEntity<Void> save(@RequestBody EmployeeDto employeeDto){
        logger.trace("REST to request create issue: {}", employeeDto);
        try {
            employeeService.create(employeeDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception ex){
            logger.error(ex.getMessage(), ex);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

