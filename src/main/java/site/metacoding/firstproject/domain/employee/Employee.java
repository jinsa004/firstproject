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
	private String employeeAddress;
	private Integer employeeTel;
	private Integer locationId;
	private Integer areaId;
}
