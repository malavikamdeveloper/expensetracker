package org.jsp.expense;

public interface UserService {
	User registerUser(User user);
	String loginUser(String email,String password);

}
