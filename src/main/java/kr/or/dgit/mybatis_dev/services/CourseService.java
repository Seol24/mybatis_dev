package kr.or.dgit.mybatis_dev.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.CourseMapper;
import kr.or.dgit.mybatis_dev.dao.CourseMapperImpl;
import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class CourseService {
	
	
	public List<Course> searchCourse(Map<String, Object> param){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchCourse(param);
		}
	}
	public List<Course> searchChooseCourse(Map<String, Object> param){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchChooseCourse(param);
		}
	}
	public List<Course> searchWhereCourses(Map<String, Object> param){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchWhereCourses(param);
		}
	}
	public List<Course> searchTrimCourses(Map<String, Object> param){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchTrimCourses(param);
		}
	}
	public List<Course> searchForeachCoursesByTutors(Map<String, Object> param){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchForeachCoursesByTutors(param);
		}
	}
}
