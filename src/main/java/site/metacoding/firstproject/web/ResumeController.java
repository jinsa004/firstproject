package site.metacoding.firstproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.resume.Resume;
import site.metacoding.firstproject.service.ResumeService;


@RequiredArgsConstructor
@Controller
public class ResumeController {
    
    private final ResumeService resumeService;


    @PostMapping("/resume/post")
    public String insertResume(Resume resume){
        resumeService.이력서작성(resume);
        return"/";
    }
}
