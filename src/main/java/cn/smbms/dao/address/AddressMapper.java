package cn.smbms.dao.address;

import cn.smbms.pojo.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
	//查询全部
	public List<Address> getAddressList();//查询全部
	//删除
	public int delAddress(@Param("id") int id);
	//修改
	public int updateAddress(Address address);
	//新增
	public int insertAddress(Address address);
	//根据ID查询
	public Address getAddressById(@Param("id") int id);

}
