package site.metacoding.firstproject.domain.resume;

import java.util.List;

public interface ResumeDao {
    public List<Resume> findAll();
	public Resume findById(Integer id);
	public void insert(Resume resume);
	public void update(Integer id, Resume resume);
	public void deleteById(Integer id);
}
