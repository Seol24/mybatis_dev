package kr.or.dgit.mybatis_dev;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev.dto.Course;
import kr.or.dgit.mybatis_dev.services.CourseService;

public class CourseServiceTest {
	private static CourseService courseService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseService = new CourseService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseService = null;
	}

	/*@Test
	public void atestsearchCourse() {
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);
		param.put("courseName", "%java%");
		param.put("startDate", "2013-01-01");
		param.put("endDate", "2013-05-01");
		List<Course> searchCourse = courseService.searchCourse(param);
		Assert.assertNotNull(searchCourse);
	}
	@Test
	public void btestsearchChooseCourse() {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("SearchBy", "Tutor");
		param.put("tutorId", 1);
		
		List<Course> searchChooseCourse = courseService.searchChooseCourse(param);
		Assert.assertNotNull(searchChooseCourse);
		
		param.replace("SearchBy", "CourseName");
		param.remove("tutorId");
		param.put("courseName", "%java%");
		
		searchChooseCourse = courseService.searchChooseCourse(param);
		Assert.assertNotNull(searchChooseCourse);
		
	}
	
	@Test
	public void ctestsearchWhereCourses() {
		Map<String, Object> param = new HashMap<String, Object>();
		
		List<Course> searchWhereCourses = courseService.searchWhereCourses(param);
		Assert.assertNotNull(searchWhereCourses);
		
		param.put("tutorId", 1);
		searchWhereCourses = courseService.searchWhereCourses(param);
		Assert.assertNotNull(searchWhereCourses);
		
		param.put("courseName", "%java%");
		searchWhereCourses = courseService.searchWhereCourses(param);
		Assert.assertNotNull(searchWhereCourses);
		
		param.clear();
		param.put("endDate", new Date());
		searchWhereCourses = courseService.searchWhereCourses(param);
		Assert.assertNotNull(searchWhereCourses);
		
	}
	@Test
	public void dtestsearchTrimCourses() {
		Map<String, Object> param = new HashMap<String, Object>();
		List<Course> searchTrimCourses = courseService.searchWhereCourses(param);
		Assert.assertNotNull(searchTrimCourses);
		
		param.put("tutorId", 1);
		searchTrimCourses = courseService.searchWhereCourses(param);
		Assert.assertNotNull(searchTrimCourses);
		
		param.put("courseName", "%java%");
		searchTrimCourses = courseService.searchWhereCourses(param);
		Assert.assertNotNull(searchTrimCourses);
		
		
	}*/
	@Test
	public void searchForeachCoursesByTutors(){
		Map<String, Object> param =null;
		List<Course> searchForeachCoursesByTutors = courseService.searchForeachCoursesByTutors(param);
		
		List<Integer> tutorIds = new ArrayList<Integer>();
		
		tutorIds.add(2);
		
		param = new HashMap<String, Object>();
		param.put("tutorIds", tutorIds);
		
		searchForeachCoursesByTutors = courseService.searchForeachCoursesByTutors(param);
		
		tutorIds.add(1);
		searchForeachCoursesByTutors = courseService.searchForeachCoursesByTutors(param);
		Assert.assertNotNull(searchForeachCoursesByTutors);
	}
}
