package com.hawkware.chat.model.user;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {

	Map<String, User> usersMap = new HashMap<String, User>();
	
	@Override
	public boolean saveUser(User user) {
		User savedUser = usersMap.put(user.getName(), user);
		return true;
	}

}
