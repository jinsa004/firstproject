package site.metacoding.firstproject.domain.employee;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
	private Integer employeeId;
	private String employeeName;
	private String employeeSex;
	private String employeeBirth;
	private String employeeUsername;
	private String employeePassword;
	private String employeeEmail;
	private Integer employeeTel;
	private Integer employeeLocation;
	private Integer jobId;
}
