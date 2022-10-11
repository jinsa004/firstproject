package site.metacoding.firstproject.web;

import java.io.Console;

import javax.xml.crypto.Data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.service.employeeService;
import site.metacoding.firstproject.web.dto.request.employee.EmployeeJoinDto;
import site.metacoding.firstproject.web.dto.response.employee.CMRespDto;

@RequiredArgsConstructor
@Controller
public class loginController {

	private final employeeService employeeService;

	@PostMapping("/main")
	public @ResponseBody CMRespDto<?> employeeJoin(@RequestBody EmployeeJoinDto employeeJoinDto) {
		employeeService.employeeJoin(employeeJoinDto);
		return new CMRespDto<>(1, "회원가입성공", null);
	}

	@GetMapping("/main")
	public String mainJoin() {
		return "user/main";
	}

	@GetMapping("/")
	public String main() {
		return "user/main";
	}
}
