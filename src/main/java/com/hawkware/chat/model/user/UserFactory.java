package com.hawkware.chat.model.user;

public interface UserFactory {
 
	User createUser(String expectedName) throws InvalidUsernameException;

}
