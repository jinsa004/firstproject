package site.metacoding.firstproject.domain.employee;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
	private Integer employeeId;
	private String employeeName;
	private Integer employeeBirth;
	private String employeeSex;
	private String employeeUsername;
	private String employeePassword;
	private String employeeEmail;
	private String employeeLocation;
	private String employeeTel;
	private Integer jobId;

	public Employee(String employeeName, Integer employeeBirth, String employeeSex, String employeeUsername,
			String employeePassword, String employeeEmail, String employeeLocation, String employeeTel) {
		this.employeeName = employeeName;
		this.employeeBirth = employeeBirth;
		this.employeeUsername = employeeUsername;
		this.employeePassword = employeePassword;
		this.employeeEmail = employeeEmail;
		this.employeeLocation = employeeLocation;
		this.employeeTel = employeeTel;
	}

}
