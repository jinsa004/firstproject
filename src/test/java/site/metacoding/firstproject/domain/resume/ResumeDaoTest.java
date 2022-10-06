package site.metacoding.firstproject.domain.resume;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;

import site.metacoding.firstproject.config.MyBatisConfig;

@Import(MyBatisConfig.class) // MyBatisTest가 MyBatisConfig를 못읽음
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 실DB사용
@MybatisTest
public class ResumeDaoTest {

	@Autowired
	private ResumeDao resumeDao;

	/*
	 * @Test
	 * public void insert_test() {
	 * // given
	 * String resumeName = "이력서";
	 * Integer employeeId = 1;
	 * Integer jobId = 1;
	 * boolean isMain = true;
	 * Resume resume = new Resume(resumeName, employeeId, jobId, isMain);
	 * 
	 * // when
	 * int result = resumeDao.insert(resume);
	 * System.out.println(resume.getResumeName());
	 * 
	 * // then
	 * assertEquals(1, result);
	 * 
	 * }
	 */

	@Test
	public void findByIdTest() {

		// given
		Integer resumeId = 1;

		// when

		Resume resume = resumeDao.findById(resumeId);

		// then
		assertEquals("영운고", resume.getHighschoolName());
	}

}
