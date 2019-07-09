package cn.smbms.service.user;

import cn.smbms.pojo.User;

import java.util.List;

public interface UserService {
	public User login(String userCode, String userPassword) throws Exception;
	public List<User> getUserList();
	public boolean delUser(Integer id);
	public boolean updateUser(User user);
	public boolean insertUser(User user);
	public User getUserById(Integer id);
}
