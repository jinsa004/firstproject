package site.metacoding.firstproject.web.dto.resume.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateDto {
	private String resumeName;
	private Integer employeeId;
	private Integer jobId;
}
