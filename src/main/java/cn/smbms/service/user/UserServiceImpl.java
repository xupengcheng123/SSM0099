package cn.smbms.service.user;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	UserMapper userMapper;
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

}
