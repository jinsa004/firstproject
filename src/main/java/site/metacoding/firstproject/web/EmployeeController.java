package site.metacoding.firstproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.service.EmployeeService;

@RequiredArgsConstructor
@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping(value="/employee/joinForm")
    public String joinForm(){
        return "/employee/joinForm";
    }

    @RequestMapping(value="/address/jusoPopup", method = {RequestMethod.GET, RequestMethod.POST})
    public String getJusoAPI(){
        return "/address/jusoPopup";
    }

    

}
