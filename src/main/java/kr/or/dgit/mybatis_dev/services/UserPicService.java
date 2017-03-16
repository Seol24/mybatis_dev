package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.UserPicMapper;
import kr.or.dgit.mybatis_dev.dao.UserPicMapperImpl;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class UserPicService {
	

	
	public UserPic findUserPicById(int id) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			UserPic userPic =  userPicMapper.selectUserPicById(id);
			sqlSession.commit();
			return userPic;
		}
	   }
	public int insertUserPic(UserPic userpic){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			int res = userPicMapper.insertUserPic(userpic);
			sqlSession.commit();
			return res;
		}
		
	
	}
}
