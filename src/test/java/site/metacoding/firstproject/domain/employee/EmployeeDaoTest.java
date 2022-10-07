package site.metacoding.firstproject.domain.employee;

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
public class EmployeeDaoTest {

	@Autowired
	private EmployeeDao employeeDao;

	@Test
	public void findByIdTest() {
		// given
		Integer employeeId = 1;

		// when
		Employee employeePS = employeeDao.findById(employeeId);

		// then
		assertEquals("이성지", employeePS.getEmployeeName());
	}
}
