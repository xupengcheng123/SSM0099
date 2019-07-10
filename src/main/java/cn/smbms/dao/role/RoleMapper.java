package cn.smbms.dao.role;

import cn.smbms.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
	public Role getLoginRole(@Param("roleCode") String RoleCode) throws Exception;//登陆
	//查询全部
	public List<Role> getRoleList();//查询全部
	//删除
	public int delRole(@Param("id") int id);
	//修改
	public int updateRole(Role role);
	//新增
	public int insertRole(Role role);
	//根据ID查询
	public Role getRoleById(@Param("id") int id);

}
