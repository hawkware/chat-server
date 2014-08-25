package com.hawkware.chat.model.user;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hawkware.chat.model.user.User;
import com.hawkware.chat.model.user.UserRepository;
import com.hawkware.chat.model.user.UserRepositoryImpl;

public class UserRepositoryTest {

	private UserRepository userRepository;
	
	@Before
	public void setUp() throws Exception {
			userRepository = new UserRepositoryImpl();
	}

	@After
	public void tearDown() throws Exception {
		userRepository = null;
	}

	@Test
	public void testSaveUser() {
		String name = "Alice";
		User user = new User(name);
		
		boolean saved = userRepository.saveUser(user);
		
		Assert.assertTrue("saveUser operation was not successful",saved);
	}

}
