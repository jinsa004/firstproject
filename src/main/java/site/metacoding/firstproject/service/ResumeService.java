package site.metacoding.firstproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.resume.Resume;
import site.metacoding.firstproject.domain.resume.ResumeDao;

@RequiredArgsConstructor
@Service
public class ResumeService {

    private final ResumeDao resumeDao;

    public Resume 이력서한건보기(Integer resumeId) {
        Resume resume = resumeDao.findById(resumeId);
        return resume;
    }

    public void 이력서작성(Resume resume) {
        resumeDao.insert(resume);
    }

    public void 이력서수정(Integer resumeId, Resume resume) {
        resumeDao.findById(resumeId);
        resumeDao.update(resumeId, resume);
    }

}
