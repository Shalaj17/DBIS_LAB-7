package com.mvc.bean;

//As I have already told it contains only setters and getters

public class CourseBean
{
private String id;
private String course_id;
private String course_name;
private String grade;
public CourseBean()
{
	
}
public CourseBean(String id,String course_id,String course_name,String grade)
{
	this.id=id;
	this.course_id=course_id;
	this.course_name=course_name;
	this.grade = grade;
}
public String getcourse_name() {
	return course_name;
}
public void setcourse_name(String course_name) {
	this.course_name = course_name;
}
public String getcourse_id() {
	return course_id;
}
public void setcourse_id(String course_id) {
	this.course_id = course_id;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getgrade() {
	return grade;
}
public void setgrade(String grade) {
	this.grade = grade;
}

}