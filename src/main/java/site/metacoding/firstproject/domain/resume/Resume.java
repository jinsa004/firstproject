package site.metacoding.firstproject.domain.resume;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import site.metacoding.firstproject.web.dto.resume.response.UpdateDto;

@AllArgsConstructor
@Setter
@Getter
public class Resume {
    private Integer resumeId;
    private String resumeName;
    private Integer employeeId;
    private String resumeImage;
    private String highschoolName;
    private Integer highschoolStartdate;
    private Integer highschoolEnddate;
    private String highschoolMajor;
    private String univName;
    private Integer univStartdate;
    private Integer univEnddate;
    private String univMajor;
    private float univGrades;
    private String prevCo;
    private String careerPeriod;
    private String careerPosition;
    private String careerDepartment;
    private String careerTask;
    private Integer jobId;
    private boolean isMain;
    private Timestamp createdAt;

    public Resume(String resumeName, Integer employeeId, Integer jobId) {
        this.resumeName = resumeName;
        this.employeeId = employeeId;
        this.jobId = jobId;
    }

    /*
     * public void update(UpdateDto updateDto) {
     * this.resumeName = updateDto.getResumeName();
     * this.employeeId = updateDto.getEmployeeId();
     * this.jobId = updateDto.getJobId();
     * }
     */

    public void update(Resume resume) {
        this.resumeName = resumeName;
        this.employeeId = employeeId;
        this.jobId = jobId;
    }

}
