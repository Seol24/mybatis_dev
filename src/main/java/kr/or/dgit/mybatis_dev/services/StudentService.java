package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentMapper;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class StudentService {
	private static Log log = LogFactory.getLog(StudentService.class);
	private String nameSpace = "kr.or.dgit.mybatis_dev.dao.StudentMapper";

	public Student selectStudentByNoForResultMap(Student student) {
		log.debug("selectStudentByNoForResultMap()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(nameSpace + ".selectStudentByNoForResultMap", student);
		}
	}

	public List<Student> selectStudentByAllForResultMap() {
		log.debug("selectStudentByAllForResultMap()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForResultMap();
		}
	}

	public Map<String, Object> selectStudentByNoForHashMap(Student student) {
		log.debug("selectStudentByNoForHashMap()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(nameSpace + ".selectStudentByNoForHashMap", student);
		}
	}

	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		log.debug("selectStudentByAllForHashMap()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.selectList(nameSpace + ".selectStudentByAllForHashMap");
		}
	}

	public Student selectStudentByNoWithAddress(Student student) {
		log.debug("selectStudentByNoWithAddress()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(nameSpace + ".selectStudentByNoWithAddress", student);
		}
	}

	public Student selectStudentByNoAssociationAddress(Student student) {
		log.debug("selectStudentByNoAssociationAddress()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(nameSpace + ".selectStudentByNoAssociationAddress", student);
		}
	}

	public int updateSetStudent(Student student) {
		int res = -1;
		log.debug("updateSetStudent()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			res = sqlSession.getMapper(StudentMapper.class).updateSetStudent(student);
			sqlSession.commit();
			return res;
		}
	}

	public int insertStudent(Student student) {
		log.debug("insertStudent()");
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			int res = sqlSession.getMapper(StudentMapper.class).insertStudent(student);
			sqlSession.commit();
			return res;
		}

	}

}
