package site.metacoding.firstproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.company.Company;
import site.metacoding.firstproject.service.CompanyService;
import site.metacoding.firstproject.web.dto.request.company.UpdateDto;
import site.metacoding.firstproject.web.dto.response.company.CMRespDto;

@RequiredArgsConstructor
@Controller
public class CompanyController {

  private final CompanyService companyService;

  @GetMapping("/co/companyUpdate/{companyId}")
  public String companyUpdate(@PathVariable Integer companyId, Model model) {
    Company companyPS = companyService.기업회원정보관리(companyId);
    model.addAttribute("company", companyPS);
    return "co/company_info";
  }

  @PutMapping("/co/companyUpdate")
  public @ResponseBody CMRespDto<?> companyUpdate(@PathVariable Integer companyId, @RequestBody UpdateDto updateDto) {
    companyService.기업회원정보수정(companyId, updateDto);
    return new CMRespDto<>(1, "수정성공", null);
  }

}
