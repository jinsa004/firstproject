package site.metacoding.firstproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.resume.Resume;
import site.metacoding.firstproject.domain.resume.ResumeDao;
import site.metacoding.firstproject.web.dto.resume.request.UpdateDto;

@RequiredArgsConstructor
@Service
public class ResumeService {

    private final ResumeDao resumeDao;



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
