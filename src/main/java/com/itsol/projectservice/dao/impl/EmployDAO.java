//package com.itsol.projectservice.dao.impl;
//
//import com.itsol.projectservice.domain.Employee;
//import com.itsol.projectservice.dto.EmployeeDto;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.persistence.EntityManager;
//import java.util.List;
//
//public class EmployDAO {
//
//    @Autowired
//    private EntityManager entityManager;
//    public Employee getById(long id){
//        return entityManager.find(Employee.class,id);
//    }
//    public List<EmployeeDto> getAllEmployee(){
//        return entityManager.createQuery("FROM Employee ").getResultList();
//    }
//}
