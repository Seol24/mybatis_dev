package kr.or.dgit.mybatis_dev;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.services.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
		studentService= null;
	}
	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}
	

	@Test
	public void atestFindStudentByNO() {
		Student std = new Student();
		std.setStudId(1);
		Student findStd = studentService.findStudentByNO(std);
		Assert.assertNotNull(findStd);
	}
	@Test
	public void btestfindStudentByNOApi(){
		Student std = new Student();
		std.setStudId(1);
		Student findStd = studentService.findStudentByNOApi(std);
		Assert.assertNotNull(findStd);
	}
	@Test
	public void ctestfindStudentByNOAnnotation(){
		Student std = new Student();
		std.setStudId(1);
		Student findStd = studentService.findStudentByNOAnnotation(std);
		Assert.assertNotNull(findStd);
	}
	@Test
	public void testSelectStudentByAll(){
		List<Student> std = studentService.selectStudentByAll();
		for(Student s : std){
	         System.out.println(s);
	      }
		Assert.assertNotNull(std);
	}
	@Test
	public void testSelectStudentByApi(){
		List<Student> std = studentService.selectStudentByApi();
		for(Student s : std){
	         System.out.println(s);
	      }
		Assert.assertNotNull(std);
	}
	
	@Test
	public void testselectStudentByAnnotation(){
		List<Student> std = studentService.selectStudentByAnnotation();
		for(Student s : std){
	         System.out.println(s);
	      }
		Assert.assertNotNull(std);
	}
	/*@Test
	public void testinsertStudent(){
		Student std = new Student(4, "설동현", "sdh@naver.com", new Date(), new PhoneNumber("010-5223-4317"));
		int res = studentService.insertStudent(std);
		Assert.assertEquals(1, res);
	}*/
/*	@Test
	public void testinsertStudentApi(){
		Student std = new Student(6, "배보람", "bbl@test.co.kr", new Date(), new PhoneNumber("010-2678-4678"));
		int res = studentService.insertStudentApi(std);
		Assert.assertEquals(1, res);
	}*/
	/*@Test
	public void testinsertStudentAnnotation(){
		Student std = new Student(5, "설유홍", "suh@test.co.kr", new Date(), new PhoneNumber("010-0000-0000"));
		int res = studentService.insertStudentAnnotation(std);
		Assert.assertEquals(1, res);
	}*/
	
/*	@Test
	public void testupdateStudent(){
		Student std = new Student(1, "설동훈", "sdh@test.co.kr", new Date(), new PhoneNumber("010-2618-4317"));
		int res = studentService.updateStudent(std);
		Assert.assertEquals(1, res);
	}*/
	@Test
	public void testupdateStudentApi(){
		Student std = new Student(2, "겐지", "gs@test.co.kr", new Date(), new PhoneNumber("010-0000-0001"));
		int res = studentService.updateStudentApi(std);
		Assert.assertEquals(1, res);
	}
	@Test
	public void testupdateStudentAnnotation(){
		Student std = new Student(3, "한조","hj@test.co.kr", new Date(), new PhoneNumber("010-0000-0002"));
		int res = studentService.updateStudentAnnotation(std);
		Assert.assertEquals(1, res);
	}
/*	@Test
	public void testdeleteStudent(){
		Student std = new Student();
		std.setStudId(5);
		int res = studentService.deleteStudent(std);
		Assert.assertEquals(1, res);
	}*/
	/*@Test
	public void testdeleteStudentApi(){
		Student std = new Student();
		std.setStudId(4);
		int res = studentService.deleteStudent(std);
		Assert.assertEquals(1, res);
	}*/
	public void testdeleteStudentAnnotation(){
		Student std = new Student();
		std.setStudId(6);
		int res = studentService.deleteStudent(std);
		Assert.assertEquals(1, res);
	}
}
