package cn.smbms.service.address;

import cn.smbms.dao.address.AddressMapper;
import cn.smbms.pojo.Address;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
	@Resource
	AddressMapper addressMapper;

	@Override
	public boolean delAddress(Integer id) {
		boolean flag =false;
		if(addressMapper.delAddress(id)>0){
			flag =true;
		}
		return flag;
	}

	@Override
	public boolean updateAddress(Address address) {
		boolean flag =false;
		if(addressMapper.updateAddress(address)>0){
			flag =true;
		}
		return flag;
	}

	@Override
	public boolean insertAddress(Address address) {
		boolean flag =false;
		if(addressMapper.insertAddress(address)>0){
			flag =true;
		}
		return flag;
	}

	@Override
	public Address getAddressById(Integer id) {

		return addressMapper.getAddressById(id);
	}
	@Override
	public List<Address> getAddressList() {
		return addressMapper.getAddressList();
	}
}
