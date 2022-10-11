package site.metacoding.firstproject.web.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompanyController {

  @GetMapping("/co/company_info")
  public String company_info() {
    return "co/company_info";
  }

}
