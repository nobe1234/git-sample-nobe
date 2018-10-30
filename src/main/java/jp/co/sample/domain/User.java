package jp.co.sample.domain;

import java.util.List;

public class User {

	private Integer id;
	private String name;
	private String mail;
	private List<Integer> hobbyList;
	private Integer age;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail + ", hobbyList=" + hobbyList + ", age=" + age
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Integer> getHobbyList() {
		return hobbyList;
	}

	public void setHobbyList(List<Integer> hobbyList) {
		this.hobbyList = hobbyList;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
