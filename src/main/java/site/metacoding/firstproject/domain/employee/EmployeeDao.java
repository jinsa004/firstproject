package site.metacoding.firstproject.domain.employee;

import java.util.List;

public interface EmployeeDao {
	public List<Employee> findAll();
	public Employee findById(Integer employeeId);
	public int insert(Employee employee);
	public void update(Integer employeeId, Employee employee);
	public void deleteById(Integer employeeId);
}
