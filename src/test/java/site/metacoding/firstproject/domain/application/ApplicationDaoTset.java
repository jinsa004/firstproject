package site.metacoding.firstproject.domain.application;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import site.metacoding.firstproject.config.MyBatisConfig;

@Import(MyBatisConfig.class) // MyBatisTest가 MyBatisConfig를 못읽음
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 실DB사용
@MybatisTest
public class ApplicationDaoTset {

	@Autowired
	private ApplicationDao applicationDao;

/* 	@Test
	public void insertTest() {

		// given
		Integer resumeId = 1;
		Integer noticeId = 1;

		Application applicationPS = new Application(resumeId, noticeId);

		int result = applicationDao.insert(applicationPS);
		System.out.println(applicationPS.getResumeId());

		assertEquals(1, result);
	} */
}
