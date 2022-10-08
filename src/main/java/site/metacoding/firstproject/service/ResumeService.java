package site.metacoding.firstproject.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.application.Application;
import site.metacoding.firstproject.domain.application.ApplicationDao;
import site.metacoding.firstproject.domain.resume.Resume;
import site.metacoding.firstproject.domain.resume.ResumeDao;
import site.metacoding.firstproject.web.dto.resume.request.UpdateDto;

@RequiredArgsConstructor
@Service
public class ResumeService {

    private final ResumeDao resumeDao;
    private final ApplicationDao applicationDao;

    @Transactional
    public void 메인이력서등록(Integer resumeId) {
        resumeDao.setAllIsMainFalse(resumeId);
        resumeDao.updateMain(resumeId);
    }


    public void 지원하기(Application application) {
        applicationDao.insert(application);
    }

    public List<Resume> 내이력서가져오기(Integer employeeId) {
        List<Resume> resumePS = resumeDao.findByEmployeeId(employeeId);
        return resumePS;
    }

    public Resume 이력서한건보기(Integer resumeId) {
        Resume resumePS = resumeDao.findById(resumeId);
        return resumePS;
    }

    public void 이력서작성(Resume resume) {
        resumeDao.insert(resume);
    }

    public void 이력서수정(Integer resumeId, UpdateDto updateDto) {
        Resume resumePS = resumeDao.findById(resumeId);
        resumePS.update(updateDto);
        resumeDao.update(resumePS);
    }

    public void 이력서삭제(Integer resumeId) {
        resumeDao.deleteById(resumeId);
    }

}
