package cn.smbms.service.user;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	UserMapper userMapper;

	@Override
	public boolean delUser(Integer id) {
		boolean flag =false;
		if(userMapper.delUser(id)>0){
			flag =true;
		}
		return flag;
	}

	@Override
	public boolean updateUser(User user) {
		boolean flag =false;
		if(userMapper.updateUser(user)>0){
			flag =true;
		}
		return flag;
	}

	@Override
	public boolean insertUser(User user) {
		boolean flag =false;
		if(userMapper.insertUser(user)>0){
			flag =true;
		}
		return flag;
	}

	@Override
	public User getUserById(Integer id) {

		return userMapper.getUserById(id);
	}

	@Override
	public User login(String userCode, String userPassword) throws Exception {
		User user = null;
		user = userMapper.getLoginUser(userCode);
		if(user!=null){
			if(!user.getUserPassword().equals(userPassword)){
				user=null;
			}
		}
		return user;
	}

	@Override
	public List<User> getUserList() {
		return userMapper.getUserList();
	}
}
