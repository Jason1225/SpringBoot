package com.benlai.springbootmybatismail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.benlai.springbootmybatismail_service.MailService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {
	@Autowired
	private MailService MailService;
	@Test
	public void testName() throws Exception {
		MailService.sendSimpleMail("401701638@qq.com", "test simple mail", "hello this is simple mail");
	}
}
