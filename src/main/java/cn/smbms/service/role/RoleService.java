package cn.smbms.service.role;

import cn.smbms.pojo.Role;

import java.util.List;

public interface RoleService {
	public List<Role> getRoleList();
	public boolean delRole(Integer id);
	public boolean updateRole(Role role);
	public boolean insertRole(Role role);
	public Role getRoleById(Integer id);
}
