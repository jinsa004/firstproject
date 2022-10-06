package site.metacoding.firstproject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.resume.Resume;
import site.metacoding.firstproject.service.ResumeService;

@RequiredArgsConstructor
@Controller
public class ResumeController {
    private final ResumeService resumeService;

    @GetMapping("/company")
    public String getResumeList(Model model) {
        List<Resume> resumeListPS = resumeService.이력서목록보기();
        model.addAttribute("resumeListPS", resumeListPS);
        return "resume/resumeMain";
    }
}
