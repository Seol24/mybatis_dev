package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.AddressMapper;
import kr.or.dgit.mybatis_dev.dao.AddressMapperImpl;
import kr.or.dgit.mybatis_dev.dto.Address;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class AddressService {
   private static final AddressService instance = new AddressService();
   
   
   private AddressService() { }


   public static AddressService getInstance() {
      return instance;
   }

   public Address selectAddressByAddrIdAndState(String state, String zip) {
      try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
         AddressMapper addressMapper = new AddressMapperImpl(sqlSession);
         return addressMapper.selectAddressByAddrIdAndState(state, zip);
      }
   }

   public Address selectAddressByAddrIdAndStateForMap(Map<String, Object> param) {
      try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
         AddressMapper addressMappre = new AddressMapperImpl(sqlSession);
         return addressMappre.selectAddressByAddrIdAndStateForMap(param);
      }
   }
   public List<Address> selectAddressByAll(RowBounds rowBounds) {
	   try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
	         AddressMapper addressMappre = new AddressMapperImpl(sqlSession);
	         return addressMappre.selectAddressByAll(rowBounds);
	      }
   }
   
   
}