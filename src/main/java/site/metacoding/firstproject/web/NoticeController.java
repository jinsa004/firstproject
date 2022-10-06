package site.metacoding.firstproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

import java.util.List;

import site.metacoding.firstproject.domain.notice.Notice;
import site.metacoding.firstproject.service.NoticeService;

@RequiredArgsConstructor
@Controller
public class NoticeController {

    private final NoticeService noticeService;

    @GetMapping({ "/", "/notice" })
    public String getNoticeList(Model model) {
        List<Notice> noticeListPS = noticeService.채용공고목록보기();
        model.addAttribute("noticeListPS", noticeListPS);
        return "notice/notice_main";
    }

}