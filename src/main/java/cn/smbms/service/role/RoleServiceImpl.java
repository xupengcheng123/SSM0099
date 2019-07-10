package cn.smbms.service.role;
import cn.smbms.dao.role.RoleMapper;
import cn.smbms.pojo.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
	@Resource
	RoleMapper roleMapper;

	@Override
	public boolean delRole(Integer id) {
		boolean flag =false;
		if(roleMapper.delRole(id)>0){
			flag =true;
		}
		return flag;
	}

	@Override
	public boolean updateRole(Role Role) {
		boolean flag =false;
		if(roleMapper.updateRole(Role)>0){
			flag =true;
		}
		return flag;
	}

	@Override
	public boolean insertRole(Role Role) {
		boolean flag =false;
		if(roleMapper.insertRole(Role)>0){
			flag =true;
		}
		return flag;
	}

	@Override
	public Role getRoleById(Integer id) {

		return roleMapper.getRoleById(id);
	}

	@Override
	public List<Role> getRoleList() {
		return roleMapper.getRoleList();
	}
}
