package kr.or.dgit.mybatis_dev.services;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentMapper;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class StudentService {
	private static Log log = LogFactory.getLog(StudentService.class);
	private String nameSpace ="kr.or.dgit.mybatis_dev.dao.StudentMapper";
	
	public Student selectStudentByNoForResultMap(Student student){
		log.debug("selectStudentByNoForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(nameSpace+".selectStudentByNoForResultMap", student);
		}
	}
	public List<Student> selectStudentByAllForResultMap(){
		log.debug("selectStudentByAllForResultMap()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForResultMap();
		}
	}
}
