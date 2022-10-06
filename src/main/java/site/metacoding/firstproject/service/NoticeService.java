package site.metacoding.firstproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.notice.Notice;
import site.metacoding.firstproject.domain.notice.NoticeDao;

@RequiredArgsConstructor
@Service
public class NoticeService {
    private final NoticeDao noticeDao;

    public List<Notice> 채용공고목록보기() {
        return noticeDao.findAll();
    }

    public List<Notice> 채용공고분야별목록보기(Integer jobCode) {
        return noticeDao.findByJobNotice(jobCode);
    }
}