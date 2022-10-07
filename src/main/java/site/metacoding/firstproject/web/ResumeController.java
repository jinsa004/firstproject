package site.metacoding.firstproject.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstproject.domain.employee.Employee;
import site.metacoding.firstproject.domain.employee.EmployeeDao;
import site.metacoding.firstproject.domain.resume.Resume;
import site.metacoding.firstproject.service.EmployeeService;
import site.metacoding.firstproject.service.ResumeService;
import site.metacoding.firstproject.web.dto.resume.request.UpdateDto;
import site.metacoding.firstproject.web.dto.resume.responsse.CMRespDto;

@RequiredArgsConstructor
@Controller
public class ResumeController {

    private final ResumeService resumeService;
    private final EmployeeService employeeService;

    @GetMapping("/resume/resumeList/{employeeId}")
    public String myResumeList(@PathVariable Integer employeeId, Model model) {
        List<Resume> resumePS = resumeService.내이력서가져오기(employeeId);
        model.addAttribute("resumePS", resumePS);
        return "/resume/myResumeList";
    }

    @GetMapping("/resume/insertForm/{employeeId}")
    public String resumeInsertForm(@PathVariable Integer employeeId, Model model) {
        Employee employeePS = employeeService.구직자정보보기(employeeId);
        model.addAttribute("employeePS", employeePS);
        return "resume/insertForm";
    }

    @PostMapping("/resume/insert")
    public @ResponseBody CMRespDto<?> insertResume(@RequestBody Resume resume) {
        resumeService.이력서작성(resume);
        return new CMRespDto<>(1, "이력서 등록 성공", null);
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

    @DeleteMapping("/resume/{resumeId}/delete")
    public @ResponseBody CMRespDto<?> deleteResume(@PathVariable Integer resumeId) {
        resumeService.이력서삭제(resumeId);
        return new CMRespDto<>(1, "이력서 삭제 성공", null);
    }
}