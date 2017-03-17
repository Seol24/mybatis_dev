package kr.or.dgit.mybatis_dev;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.services.AddressService;
import kr.or.dgit.mybatis_dev.services.StudentService;

public class AddressServiceTest {
	private static AddressService addressService;
	@BeforeClass
    public static void setUpBeforeClass() throws Exception {
		addressService = AddressService.getInstance();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
       addressService = null;
    }

	@Test
	public void testselectAddressByAddrIdAndState() {
		Address address = addressService.selectAddressByAddrIdAndState("CA", "92110");
		Assert.assertNotNull(address);
	}
	@Test
	public void testselectAddressByAddrIdAndStateForMap(){
		Map<String, Object> param = new HashMap<>();
		param.put("state", "CA");
		param.put("zip", "92110");
		
		Address address=addressService.selectAddressByAddrIdAndStateForMap(param);
		Assert.assertNotNull(address);
	}
	@Test
	public void testselectAddressByAll(){
		RowBounds rowbounds = new RowBounds(0, 3);
		List<Address> lists = addressService.selectAddressByAll(rowbounds);
		
	}
}
