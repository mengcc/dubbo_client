package com.mzs.dubbo_client;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mzs.dubbo_server.bean.User;
import com.mzs.dubbo_server.service.UserQueryService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@WebAppConfiguration
public class AppTest{
		
	@Autowired
	private UserQueryService userQueryService;
	
	@Test
	public void test(){
		
		try {
			List<User> users = userQueryService.findAllUser();
			System.out.println(users);
			
			User user = userQueryService.findByUsername("mzs");
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
