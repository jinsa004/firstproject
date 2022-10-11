package site.metacoding.firstproject.web.dto.request.employee;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.firstproject.domain.employee.Employee;

@Setter
@Getter
public class EmployeeJoinDto {

    private String employeeName;
    private Integer employeeBirth;
    private String employeeSex;
    private String employeeUsername;
    private String employeePassword;
    private String employeeEmail;
    private String employeeTel;
    private String employeeLocation;

    public Employee toEntity() {
        Employee employee = new Employee(this.employeeName, this.employeeBirth, this.employeeSex, this.employeeUsername,
                this.employeePassword, this.employeeEmail, this.employeeTel, this.employeeLocation);
        return employee;
    }

}
