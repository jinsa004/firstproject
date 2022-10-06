package site.metacoding.firstproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.resume.Resume;
import site.metacoding.firstproject.service.ResumeService;
import site.metacoding.firstproject.web.dto.resume.request.UpdateDto;
import site.metacoding.firstproject.web.dto.resume.responsse.CMRespDto;

@RequiredArgsConstructor
@Controller
public class ResumeController {

    private final ResumeService resumeService;

    @GetMapping("/resume/insert")
    public String resumeInsertForm() {
        return "resume/insert";
    }

    @PostMapping("/resume/insert")
    public String insertResume(Resume resume) {
        resumeService.이력서작성(resume);
        return "redirect:/";
    }

    @GetMapping("/resume/{resumeId}/updateForm")
    public String resumeUpdateForm(@PathVariable Integer resumeId, Model model) {
        Resume resumePS = resumeService.이력서한건보기(resumeId);
        model.addAttribute("resumePS", resumePS);
        return "/resume/updateForm";
    }

    @PutMapping("/resume/{resumeId}/update")
    public @ResponseBody CMRespDto<?> updateResume(@PathVariable Integer resumeId, @RequestBody UpdateDto updateDto) {
        resumeService.이력서수정(resumeId, updateDto);
        return new CMRespDto<>(1, "이력서 수정 성공", null);
    }
}
