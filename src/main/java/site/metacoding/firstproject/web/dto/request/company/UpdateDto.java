package site.metacoding.firstproject.web.dto.request.company;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateDto {
  private Integer companyNumber;
  private String companyName;
  private String companyEmail;
  private String companyTel;
  private String companyLocation;
  private String companyUsername;
  private String companyPassword;
  private Integer jobId;
}
