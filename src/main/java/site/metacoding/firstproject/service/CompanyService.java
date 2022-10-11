package site.metacoding.firstproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.company.Company;
import site.metacoding.firstproject.domain.company.CompanyDao;
import site.metacoding.firstproject.web.dto.request.company.UpdateDto;

@RequiredArgsConstructor
@Service
public class CompanyService {
  private final CompanyDao companyDao;

  public Company 기업회원정보관리(Integer companyId) {
    return companyDao.findById(companyId);
  }

  public void 기업회원정보수정(Integer companyId, UpdateDto updateDto) {
    Company companyPS = companyDao.findById(companyId);
    companyPS.update(updateDto);
    companyDao.update(companyId, companyPS);
  }

}
