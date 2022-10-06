package site.metacoding.firstproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.resume.Resume;
import site.metacoding.firstproject.domain.resume.ResumeDao;

@RequiredArgsConstructor
@Service
public class ResumeService {
    private final ResumeDao resumeDao;

    public List<Resume> 이력서목록보기() {
        return resumeDao.findAllResume();
    }

    public List<Resume> 채용공고분야별목록보기(Integer jobCode) {
        return resumeDao.findByJobToResume(jobCode);
    }
}
