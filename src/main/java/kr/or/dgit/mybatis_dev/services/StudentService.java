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
	
	public Student findStudentByNO(Student student){
		log.debug("findStudentByNO()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByNo(student);
		}	
	}
	
	public Student findStudentByNOApi(Student student){
		log.debug("findStudentByNOApi()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.selectOne(nameSpace+".selectOne", student);
		}	
	}
	
	public Student findStudentByNOAnnotation(Student student){
		log.debug("findStudentByNOAnnotation()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByNoAnnotation(student);
		}	
	}
	
	public List<Student> selectStudentByAll(){
		log.debug("selectStudnetByAll()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAll();
		}	
	}
	public List<Student> selectStudentByApi(){
		log.debug("selectStudentByApi()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(nameSpace+".selectList");
		}
	}
	public List<Student> selectStudentByAnnotation(){
		log.debug("selectStudentByAnnotation()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAnnotation();
		}
	}
	public int insertStudent(Student student){
		log.debug("insertStudent()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			int res = sqlSession.getMapper(StudentMapper.class).insertStudent(student);
			sqlSession.commit();
			return res;
			
		}
	}
	
	public int insertStudentApi(Student student){
		log.debug("insertStudentApi()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			int res = sqlSession.insert(nameSpace+".insert", student);
			sqlSession.commit();
			return res;
		}
	}
	public int insertStudentAnnotation(Student student){
		log.debug("insertStudentAnnotation()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			int res = sqlSession.getMapper(StudentMapper.class).insertStudentAnnotation(student);
			sqlSession.commit();
			return res;
		}
	}
	
	
	
	public int updateStudent(Student student){
		log.debug("updateStudent()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			int res = sqlSession.getMapper(StudentMapper.class).updateStudent(student);
			sqlSession.commit();
			return res;
		}
	}
	
	public int updateStudentApi(Student student){
		log.debug("updateStudentApi()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			int res = sqlSession.update(nameSpace+".update", student);
			sqlSession.commit();
			return res;
		}
	}
	public int updateStudentAnnotation(Student student){
		log.debug("updateStudentAnnotation()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			int res = sqlSession.getMapper(StudentMapper.class).updateStudentAnnotation(student);
			sqlSession.commit();
			return res;
		}
	}
	
	public int deleteStudent(Student student){
		log.debug("deleteStudent()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			int res = sqlSession.getMapper(StudentMapper.class).deleteStudent(student);
			sqlSession.commit();
			return res;
		}
	}
	public int deleteStudentApi(Student student){
		log.debug("deleteStudentApi()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			int res = sqlSession.delete(nameSpace+".delete", student);
			sqlSession.commit();
			return res;
		}
	}
	public int deleteStudentAnnotation(Student student){
		log.debug("deleteStudentAnnotation()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			int res = sqlSession.getMapper(StudentMapper.class).deleteStudentAnnotation(student);
			sqlSession.commit();
			return res;
		}
	}
}
