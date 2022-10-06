package site.metacoding.firstproject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/company/resume")
    public String getNoticeFrontend(@RequestParam("jobCode") Integer jobCode, Model model) {
        List<Resume> resumeJobListPS = resumeService.채용공고분야별목록보기(jobCode);
        model.addAttribute("resumeJobListPS", resumeJobListPS);
        return "resume/resumeJob";
    }
}
