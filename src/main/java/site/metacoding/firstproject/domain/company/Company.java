package site.metacoding.firstproject.domain.company;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.firstproject.web.dto.request.company.UpdateDto;

@NoArgsConstructor
@Setter
@Getter
public class Company {
	private Integer companyId;
	private Integer companyNumber;
	private String companyName;
	private String companyEmail;
	private String companyTel;
	private String companyLocation;
	private String companyUsername;
	private String companyPassword;
	private Integer jobId;

	public Company(Integer companyNumber, String companyName, String companyEmail, String companyTel,
			String companyLocation, String companyUsername, String companyPassword, Integer jobId) {
		this.companyNumber = companyNumber;
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyTel = companyTel;
		this.companyLocation = companyLocation;
		this.companyUsername = companyUsername;
		this.companyPassword = companyPassword;
		this.jobId = jobId;
	}

	public void update(UpdateDto updateDto) {
		this.companyNumber = updateDto.getCompanyNumber();
		this.companyName = updateDto.getCompanyName();
		this.companyEmail = updateDto.getCompanyEmail();
		this.companyTel = updateDto.getCompanyTel();
		this.companyLocation = updateDto.getCompanyLocation();
		this.companyUsername = updateDto.getCompanyUsername();
		this.companyPassword = updateDto.getCompanyPassword();
		this.jobId = updateDto.getJobId();
	}
}
