package site.metacoding.firstproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.employee.Employee;
import site.metacoding.firstproject.domain.employee.EmployeeDao;
import site.metacoding.firstproject.web.dto.request.employee.EmployeeJoinDto;

@RequiredArgsConstructor
@Service
public class employeeService {

    private final EmployeeDao employeeDao;

    public void employeeJoin(EmployeeJoinDto employeeJoinDto) {
        Employee employee = employeeJoinDto.toEntity();
        employeeDao.insert(employee);
    }
}
