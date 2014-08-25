package com.hawkware.chat.model.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.hawkware.chat.model.user.InvalidUsernameException;
import com.hawkware.chat.model.user.User;
import com.hawkware.chat.model.user.UserFactory;
import com.hawkware.chat.model.user.UserFactoryImpl;

public class UserFactoryTest {

	private UserFactory userFactory;
	
	@Before
	public void setUp() throws Exception {
		userFactory = new UserFactoryImpl();
	}

	@After
	public void tearDown() throws Exception {
		userFactory = null;
	}

	@Test
	public void testCreateUserWithName() {
		String expectedName = "joebloggs";
		
		User user;
		try {
			user = userFactory.createUser(expectedName);
			Assert.assertNotNull("user should not be null", user);
			Assert.assertEquals("actual username does not match expected",expectedName, user.getName());
		} catch (InvalidUsernameException e) {
			fail(e.getMessage());
		}
		
	}

	@Test(expected = InvalidUsernameException.class)
	public void testCreateUserWithNullNameThrowsInvalidUsernameExceotion() throws InvalidUsernameException{
		String nullName = null;
		userFactory.createUser(nullName);
	}
	
	@Test(expected = InvalidUsernameException.class)
	public void testCreateUserWithEmptyNameThrowsInvalidUsernameExceotion() throws InvalidUsernameException{
		String nullName = "";
		userFactory.createUser(nullName);
	}
	
	@Test(expected = InvalidUsernameException.class)
	public void testCreateUserWithSpaceAsNameThrowsInvalidUsernameExceotion() throws InvalidUsernameException{
		String nullName = " ";
		userFactory.createUser(nullName);
	}
}
