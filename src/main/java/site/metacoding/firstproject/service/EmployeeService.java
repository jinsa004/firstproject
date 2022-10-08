package site.metacoding.firstproject.service;


import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.employee.Employee;
import site.metacoding.firstproject.domain.employee.EmployeeDao;

@RequiredArgsConstructor
@Service
public class EmployeeService {

	private final EmployeeDao employeeDao;

	public Employee 구직자정보보기(Integer employeeId) {
		Employee employeePS = employeeDao.findById(employeeId);
		return employeePS;
	}
}
