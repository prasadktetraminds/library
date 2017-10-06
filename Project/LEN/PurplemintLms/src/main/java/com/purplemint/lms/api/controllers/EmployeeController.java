package com.purplemint.lms.api.controllers;

import com.purplemint.lms.api.entities.Employee;
import com.purplemint.lms.api.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by mmalyala on 10/2/2017.
 */
@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Employee create(@RequestBody Employee emp) {
        return employeeService.create(emp);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    Employee delete(@PathVariable("id") String id) {
        return employeeService.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Employee> findAll() {
        return employeeService.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Employee findById(@PathVariable("id") String id) {
        return employeeService.findById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    Employee update(@RequestBody @Valid Employee todoEntry) {
        return employeeService.update(todoEntry);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleTodoNotFound(Exception ex) {
    }
}
