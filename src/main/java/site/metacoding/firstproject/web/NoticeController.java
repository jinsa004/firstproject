package site.metacoding.firstproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

import java.util.List;

import site.metacoding.firstproject.domain.notice.Notice;
import site.metacoding.firstproject.service.NoticeService;

@RequiredArgsConstructor
@Controller
public class NoticeController {

    private final NoticeService noticeService;

    @GetMapping("/") // ({ "/", "/notice" }) 불가 (Mapping 주소 "notice"가 중복되기 때문)
    public String getNoticeList(Model model) {
        List<Notice> noticeListPS = noticeService.채용공고목록보기();
        model.addAttribute("noticeListPS", noticeListPS);
        return "notice/noticeMain";
    }

    @RequestMapping(value = "/notice", method = RequestMethod.GET)
    public String getNoticeFrontend(@RequestParam("jobCode") Integer jobCode, Model model) {
        List<Notice> noticeJobListPS = noticeService.채용공고분야별목록보기(jobCode);
        model.addAttribute("noticeJobListPS", noticeJobListPS);
        return "notice/noticeJob";
    }
}