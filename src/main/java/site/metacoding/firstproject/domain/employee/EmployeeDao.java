package site.metacoding.firstproject.domain.employee;

import java.util.List;

public interface EmployeeDao {
	public List<Employee> findAll();
	public Employee findById(Integer id);
	public void insert(Employee employee);
	public void update(Integer id, Employee employee);
	public void deleteById(Integer id);
}
