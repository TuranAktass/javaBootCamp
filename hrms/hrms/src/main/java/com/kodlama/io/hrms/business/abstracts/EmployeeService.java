package com.kodlama.io.hrms.business.abstracts;

import java.util.List;

import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.entities.concretes.Employee;

public interface EmployeeService {

	List<Employee> getAll();
	Result add(Employee employee);
}
