package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Course;

public class CourseMapperImpl implements CourseMapper {
	private String namespace = "kr.or.dgit.mybatis_dev.dao.CourseMapper";
	private static final Log log = LogFactory.getLog(CourseMapperImpl.class);
	
	private SqlSession sqlSession;
	
	public CourseMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<Course> searchCourse(Map<String, Object> param) {
		log.debug("searchCourse()");
		return sqlSession.selectList(namespace+".searchCourse", param);
	}

	@Override
	public List<Course> searchChooseCourse(Map<String, Object> param) {
		log.debug("searchChooseCourse()");
		return sqlSession.selectList(namespace+".searchChooseCourse", param);
	}

	@Override
	public List<Course> searchWhereCourses(Map<String, Object> param) {
		log.debug("searchWhereCourses()");
		return sqlSession.selectList(namespace+".searchWhereCourses", param);
	}

	@Override
	public List<Course> searchTrimCourses(Map<String, Object> param) {
		log.debug("searchTrimCourses()");
		return sqlSession.selectList(namespace+".searchTrimCourses", param);
	}

	@Override
	public List<Course> searchForeachCoursesByTutors(Map<String, Object> param) {
		log.debug("searchForeachCoursesByTutors()");
		return sqlSession.selectList(namespace+".searchForeachCoursesByTutors", param);
	}

}
