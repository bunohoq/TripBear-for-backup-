package com.project.trip.mapper;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

// 예시용 테스트 클래스

@RunWith(SpringJUnit4ClassRunner.class) //무지성으로 어노테이션 걸어야됨(스프링테스트용)
@WebAppConfiguration
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml",
								"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
								"file:src/main/webapp/WEB-INF/spring/security-context.xml"
}) //지금 우리가 만든 bean태그 참조용
public class MemberMapperTests {

	@Autowired
	private MemberMapper mapper;
	
	
	@Test
	public void testMapper() {
	
		assertNotNull(mapper);
		
		UserDTO dto = mapper.get("hong");
		
	}
	
	
	
}
