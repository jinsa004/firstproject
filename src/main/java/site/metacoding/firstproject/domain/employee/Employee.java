package site.metacoding.firstproject.domain.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Employee {

	private Integer employeeId;
	private String employeeName;
	private String employeeBirth;
	private String employeeSex;
	private String employeeUsername;
	private String employeePassword;
	private String employeeEmail;
	private String employeeLocation;
	private String employeeTel;
	private Integer jobId;

	public Employee(String employeeUsername, String employeePassword, String employeeLocation) {
		this.employeeUsername = employeeUsername;
		this.employeePassword = employeePassword;
		this.employeeLocation = employeeLocation;
	}
}
