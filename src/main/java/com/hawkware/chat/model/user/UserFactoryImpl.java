package com.hawkware.chat.model.user;

public class UserFactoryImpl implements UserFactory {

	@Override
	public User createUser(String name) throws InvalidUsernameException {
		if (name == null){
			throw new InvalidUsernameException();
		}
		User user = new User(name);
		return user;
	}

}
