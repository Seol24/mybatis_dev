package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import kr.or.dgit.mybatis_dev.dao.TutorMapper;
import kr.or.dgit.mybatis_dev.dao.UserPicMapper;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class UserPicService {
	private static final Logger logger = Logger.getLogger(UserPicService.class);
	private static final UserPicService instance = new UserPicService();
	
	public static UserPicService getInstance() {
		return instance;
	}

	private UserPicService() {}
	
	public UserPic findUserPicById(int id) {
	      SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
	      try{
	         UserPicMapper userPicMapper = sqlSession.getMapper(UserPicMapper.class);
	         return userPicMapper.selectUserPicById(id);
	      } finally{
	         sqlSession.close();
	      }
	   }
	public int insertUserPic(UserPic userpic){
		logger.debug("insertUserPic()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			int res = sqlSession.getMapper(UserPicMapper.class).insertUserPic(userpic);
			sqlSession.commit();
			return res;
		}
		
	
	}
}
