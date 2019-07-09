package cn.smbms.dao.user;

import cn.smbms.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
	public User getLoginUser(@Param("userCode") String userCode) throws Exception;//登陆
	//查询全部
	public List<User> getUserList();//查询全部
	//删除
	public int delUser(@Param("id")int id);
	//修改
	public int updateUser(User user);
	//新增
	public int insertUser(User user);
	//根据ID查询
	public User getUserById(@Param("id")int id);

}
