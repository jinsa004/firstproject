package site.metacoding.firstproject.domain.notice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Notice {
    private Integer noticeId;
    private Integer companyId;
    private String noticeTitle;
    private String noticeConame;
    private String noticeImage;
    private Integer noticePeriod;
    private String noticeDept;
    private String noticePosition;
    private String noticeTask;
    private String noticeSal;
    private String noticeQual;
    private String noticeCareer;
    private String noticeWellfare;
    private Integer jobId;

    // 엔티티가 아닌 필드
    private Integer jobCode;
}