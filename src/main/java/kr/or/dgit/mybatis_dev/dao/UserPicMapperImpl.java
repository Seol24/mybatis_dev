package kr.or.dgit.mybatis_dev.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.UserPic;

public class UserPicMapperImpl implements UserPicMapper {
	private String namespace ="kr.or.dgit.mybatis_dev.dao.UserPicMapper";
	private static final Log log = LogFactory.getLog(UserPicMapperImpl.class);
	
	private SqlSession sqlSession;
	
	

	public UserPicMapperImpl(SqlSession sqlseesion) {
		this.sqlSession = sqlseesion;
	}

	@Override
	public int insertUserPic(UserPic userpic) {
		log.debug("insertUserPic()");
		return sqlSession.insert(namespace+".insertUserPic", userpic);
	}

	@Override
	public UserPic selectUserPicById(int id) {
		log.debug("selectUserPicById()");
		return sqlSession.selectOne(namespace+".selectUserPicById", id);
	}

}
