package com.purplemint.lms.api.services;

import com.purplemint.lms.api.entities.Employee;
import com.purplemint.lms.api.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * Created by mmalyala on 10/2/2017.
 */
@Service
public class EmployeeService   {

    private final EmployeeRepository repository;

    @Autowired
    EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee create(Employee emp) {
        repository.save(emp);
        return emp;
    }

    public Employee delete(String id) {
        Employee deleted = findById(id);
        repository.delete(deleted);
        return deleted;
    }

    public List<Employee> findAll() {
        List<Employee> empEntries = repository.findAll();
        return empEntries;
    }


    public Employee findById(String id) {
        Employee found = findEmpById(id);
        return found;
    }

    public Employee update(Employee emp) {
        Employee updated = findEmpById(emp.getId());
        updated.setName(emp.getName());
        updated = repository.save(updated);
        return updated;
    }

    private Employee findEmpById(String id) {
        Optional<Employee> result = repository.findOne(id);
        return result.get();

    }

}

