package site.metacoding.firstproject.domain.resume;

import java.util.List;

public interface ResumeDao {
    public List<Resume> findAll();

    public Resume findById(Integer resumeId);

    public void insert(Resume resume);

    public void update(Resume resume);

    public void deleteById(Integer resumeId);

    public List<Resume> findByEmployeeId(Integer employeeId);

    public void updateMain(Integer resumeId);
}
