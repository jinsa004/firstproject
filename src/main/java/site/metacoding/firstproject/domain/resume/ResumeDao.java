package site.metacoding.firstproject.domain.resume;

import java.util.List;

public interface ResumeDao {
    public List<Resume> findAllResume();

    public List<Resume> findByJobToResume(Integer jobCode);

    public Resume findById(Integer resumeId);

    public void insert(Resume resume);

    public void update(Integer resumeId, Resume resume);

    public void deleteById(Integer resumeId);
}
