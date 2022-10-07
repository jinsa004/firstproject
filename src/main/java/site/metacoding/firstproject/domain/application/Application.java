package site.metacoding.firstproject.domain.application;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Application {
    private Integer subscribeId;
    private Integer resumeId;
    private Integer noticeId;
    private Timestamp createdAt;

    public Application(Integer resumeId, Integer noticeId) {
        this.resumeId = resumeId;
        this.noticeId = noticeId;
    }
}
