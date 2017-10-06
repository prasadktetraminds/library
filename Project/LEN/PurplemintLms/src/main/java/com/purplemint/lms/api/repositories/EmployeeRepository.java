package com.purplemint.lms.api.repositories;

import com.purplemint.lms.api.entities.Employee;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by mmalyala on 10/2/2017.
 */

public interface EmployeeRepository extends Repository<Employee, String> {

    void delete(Employee deleted);

    List<Employee> findAll();

    Optional<Employee> findOne(String id);

    Employee save(Employee saved);
}
