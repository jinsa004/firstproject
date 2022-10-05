package site.metacoding.firstproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.resume.Resume;
import site.metacoding.firstproject.domain.resume.ResumeDao;

@RequiredArgsConstructor
@Service
public class ResumeService {
    
    private final ResumeDao resumeDao;


    public void 이력서작성(Resume resume){
        resumeDao.insert(resume);
    }

}
