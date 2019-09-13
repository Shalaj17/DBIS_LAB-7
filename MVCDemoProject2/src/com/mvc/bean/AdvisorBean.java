package com.mvc.bean;



//As I have already told it contains only setters and getters

public class AdvisorBean
{
private String id;
private String advisor_id;
private String advisor_name;
public AdvisorBean()
{
	
}
public AdvisorBean(String id,String advisor_id,String advisor_name)
{
	this.id=id;
	this.advisor_id=advisor_id;
	this.advisor_name=advisor_name;
	
}
public String getadvisor_name() {
	return advisor_name;
}
public void setadvisor_name(String advisor_name) {
	this.advisor_name = advisor_name;
}
public String getadvisor_id() {
	return advisor_id;
}
public void setadvisor_id(String advisor_id) {
	this.advisor_id = advisor_id;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}


}