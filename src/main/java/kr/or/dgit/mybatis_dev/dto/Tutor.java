package kr.or.dgit.mybatis_dev.dto;

import java.util.Date;
import java.util.List;

public class Tutor {
	private int tutorId;
	private String name;
	private String email;
	private Address address;
	private List<Course> course;
	private PhoneNumber phone;
	private Date dob;
	private Gender gender;
	
	private Tutor(int tutorId, String name, String email, Address address, List<Course> course, Gender gender) {
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.course = course;
		this.gender = gender;
	}
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	
	public PhoneNumber getPhone() {
		return phone;
	}

	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s %s %s", tutorId, name, email,phone, gender);
	}

	public Tutor(int tutorId, String name, String email, PhoneNumber phone, Gender gender) {
		super();
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
	}
	
	
}
