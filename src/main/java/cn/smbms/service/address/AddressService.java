package cn.smbms.service.address;

import cn.smbms.pojo.Address;

import java.util.List;

public interface AddressService {
	public List<Address> getAddressList();
	public boolean delAddress(Integer id);
	public boolean updateAddress(Address address);
	public boolean insertAddress(Address address);
	public Address getAddressById(Integer id);
}
