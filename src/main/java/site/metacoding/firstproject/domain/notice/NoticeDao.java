package site.metacoding.firstproject.domain.notice;

import java.util.List;

public interface NoticeDao {
    public List<Notice> findAll();

    public List<Notice> findByJobNotice(Integer jobCode);

    public Notice findById(Integer id);

    public void insert(Notice notice);

    public void update(Integer id, Notice notice);

    public void deleteById(Integer id);
}